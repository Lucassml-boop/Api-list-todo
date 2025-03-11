package com.todo.todolist.controller;

import com.todo.todolist.dto.AuthRequest;
import com.todo.todolist.dto.AuthResponse;
import com.todo.todolist.dto.RegisterRequest;
import com.todo.todolist.service.UserService;
import com.todo.todolist.security.JWTUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JWTUtils jwtUtils;
    private final UserService userService;

    public AuthController(AuthenticationManager authenticationManager, JWTUtils jwtUtils, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtUtils = jwtUtils;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
            );

            String token = jwtUtils.generateToken(authRequest.getUsername());
            return ResponseEntity.ok(new AuthResponse(token));
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário ou senha inválidos.");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest) {
        boolean success = userService.registerUser (registerRequest);
        if (success) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Usuário registrado com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao registrar usuário.");
    }
}
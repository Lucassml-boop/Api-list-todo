package com.todo.todolist.service;

import com.todo.todolist.model.ToDo;
import com.todo.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    @Autowired
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    public ToDo createToDo(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    public ToDo updateToDo(Long id, ToDo updatedToDo) {
        return toDoRepository.findById(id)
                .map(existingToDo -> {
                    existingToDo.setTitle(updatedToDo.getTitle());
                    existingToDo.setDescription(updatedToDo.getDescription());
                    existingToDo.setCompleted(updatedToDo.isCompleted());
                    return toDoRepository.save(existingToDo);
                })
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada!"));
    }

    public void deleteToDo(Long id) {
        toDoRepository.deleteById(id);
    }
}
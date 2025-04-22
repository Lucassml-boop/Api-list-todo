# 📌 API Lista de Tarefas (To-Do List) - Spring Boot 🚀

Este projeto é uma **API REST** para gerenciamento de tarefas (**To-Do List**), desenvolvida em **Spring Boot** com autenticação JWT. O objetivo é permitir que usuários criem, visualizem, atualizem e excluam tarefas de forma segura e eficiente.

---

## 📌 Tecnologias Utilizadas  

- 🛠 **Spring Boot** (Framework principal)  
- 🔐 **Spring Security** (Autenticação e segurança com JWT)  
- 🗃 **JPA/Hibernate** (Persistência de dados)  
- 🏦 **MySQL ou PostgreSQL** (Banco de dados relacional)  
- 📄 **Swagger** (Documentação da API)  
- 📦 **Maven** (Gerenciador de dependências)  

---

## 🚀 Como Executar o Projeto  

### 1️⃣ Clone o Repositório  

```bash
git clone https://github.com/Lucassml-boop/Api-list-todo.git

cd Api-list-todo
```
--- 

### 2️⃣ Configure o Banco de Dados
Altere as configurações no arquivo application.properties para conectar ao seu banco de dados:
```bash
properties

Copiar

Editar

spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco

spring.datasource.username=seu_usuario

spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
```
--- 


### 3️⃣ Compile e Execute a Aplicação
```bash

Copiar

Editar

mvn spring-boot:run

A API estará disponível em:

##### 📌 http://localhost:8080/api/todos
```
--- 

### 4️⃣ Testando a API
##### 📌 Usando o Postman ou Swagger
No Postman, adicione o token JWT no cabeçalho Authorization da requisição:

makefile
Copiar
Editar
Authorization: Bearer <seu_token>
No Swagger, acesse a documentação interativa e teste as rotas:

##### 📌 http://localhost:8080/swagger-ui.html

### 📜 Rotas Principais

#### 🔐 Autenticação

| Método	 | Rota |	Descrição |
| ------------- |-------------|:-------------:|
|POST|	/api/auth/register|	Registra um novo usuário|
|POST|	/api/auth/login|	Autentica e retorna um token JWT|

##### 📌 Tarefas (Protegido por JWT)

|Método |	Rota |	Descrição |
| ------------- |-------------|:-------------:|
|GET|	/api/todos|	Lista todas as tarefas do usuário autenticado|
|POST|	/api/todos|	Cria uma nova tarefa|
|PUT|	/api/todos/{id}|	Atualiza uma tarefa|
|DELETE|	/api/todos/{id}|	Exclui uma tarefa|

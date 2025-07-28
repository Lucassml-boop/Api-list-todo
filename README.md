# 🚀 API Lista de Tarefas (To-Do List) - Spring Boot

Bem-vindo ao repositório da **API Lista de Tarefas**, um projeto backend robusto e seguro desenvolvido com **Spring Boot**. Esta API foi criada para demonstrar habilidades em autenticação JWT, arquitetura limpa, persistência de dados e documentação de APIs — tudo pronto para produção e fácil de evoluir.

---

## 📑 Sumário

- [Sobre o Projeto](#sobre-o-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Funcionalidades](#funcionalidades)
- [Como Executar](#como-executar)
- [Documentação da API](#documentação-da-api)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Diferenciais Técnicos](#diferenciais-técnicos)
- [Contato](#contato)

---

## 💡 Sobre o Projeto

Esta API permite o gerenciamento de tarefas (to-do list) com autenticação segura via JWT, seguindo as melhores práticas de desenvolvimento backend. O projeto é ideal para ser utilizado como base em aplicações reais ou como portfólio profissional.

---

## 🛠 Tecnologias Utilizadas

- **Spring Boot** — Framework principal para construção da API
- **Spring Security** — Autenticação e autorização com JWT
- **JPA/Hibernate** — Persistência de dados
- **PostgreSQL** — Banco de dados relacional
- **Swagger** — Documentação interativa da API
- **Maven** — Gerenciamento de dependências e build

---

## ✨ Funcionalidades

- Registro e autenticação de usuários com **JWT**
- Operações CRUD completas para tarefas
- Proteção de rotas sensíveis com autenticação
- Documentação interativa via **Swagger UI**
- Configuração flexível para múltiplos ambientes

---

## 🚀 Como Executar

### 1. Pré-requisitos

- **Java 17** ou superior
- **Maven**
- **PostgreSQL**

### 2. Clone o Repositório

```bash
git clone https://github.com/Lucassml-boop/Api-list-todo.git
cd Api-list-todo
```

### 3. Configure o Banco de Dados

Edite o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 4. Compile e Execute

```bash
mvn spring-boot:run
```

A API estará disponível em:  
**http://localhost:8080/api/todos**

---

## 📜 Documentação da API

Acesse a documentação interativa:  
**http://localhost:8080/swagger-ui.html**

### 🔐 Rotas de Autenticação

| Método | Rota               | Descrição                     |
|--------|--------------------|-------------------------------|
| POST   | /api/auth/register | Registra um novo usuário      |
| POST   | /api/auth/login    | Autentica e retorna um token  |

### 📌 Rotas de Tarefas (Protegidas por JWT)

| Método | Rota              | Descrição                     |
|--------|-------------------|-------------------------------|
| GET    | /api/todos        | Lista todas as tarefas        |
| POST   | /api/todos        | Cria uma nova tarefa          |
| PUT    | /api/todos/{id}   | Atualiza uma tarefa existente |
| DELETE | /api/todos/{id}   | Exclui uma tarefa             |

---

## 🧪 Testando a API

### Usando Postman

1. Autentique-se em `/api/auth/login` para obter o token JWT.
2. Adicione o token no cabeçalho das requisições:
   ```bash
   Authorization: Bearer <seu_token>
   ```

### Usando Swagger

Acesse o Swagger UI para testar as rotas de forma interativa:  
**http://localhost:8080/swagger-ui.html**

---

## 📂 Estrutura do Projeto

```plaintext
Api-list-todo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.todo.todolist/
│   │   │       ├── controller/  # Controladores REST
│   │   │       ├── model/       # Modelos de dados
│   │   │       ├── repository/  # Repositórios JPA
│   │   │       ├── service/     # Regras de negócio
│   │   │       └── security/    # Configurações de segurança
│   ├── resources/
│   │   └── application.properties  # Configurações da aplicação
├── pom.xml  # Dependências do Maven
```

---

## 🏆 Diferenciais Técnicos

- **Código limpo e modular**: Seguindo princípios SOLID e boas práticas de arquitetura.
- **Segurança robusta**: JWT, criptografia de senhas e proteção de endpoints.
- **Escalabilidade**: Estrutura preparada para crescimento e fácil manutenção.
- **Documentação clara**: Swagger UI integrado para facilitar testes e integração.
- **Pronto para produção**: Configuração flexível e fácil deploy.

---

## 📞 Contato

Se você gostou deste projeto e deseja saber mais, entre em contato:  
**Email**: lucas.sml@example.com
**LinkedIn**: [linkedin.com/in/lucassml](https://www.linkedin.com/in/lucas-samuel-borges-b551481b8/)

# 📌 API Lista de Tarefas (To-Do List) - Spring Boot 🚀

Bem-vindo ao repositório da **API Lista de Tarefas**, um projeto desenvolvido com **Spring Boot** para gerenciar tarefas de forma eficiente e segura. Este projeto demonstra habilidades em desenvolvimento backend, autenticação JWT, persistência de dados e documentação de APIs.

---

## 🛠 Tecnologias Utilizadas  

- **Spring Boot**: Framework principal para construção da API.  
- **Spring Security**: Implementação de autenticação e autorização com JWT.  
- **JPA/Hibernate**: Mapeamento objeto-relacional para persistência de dados.  
- **PostgreSQL**: Banco de dados relacional utilizado.  
- **Swagger**: Documentação interativa da API.  
- **Maven**: Gerenciador de dependências e build.  

---

## ✨ Funcionalidades  

- Registro e autenticação de usuários com **JWT**.  
- Operações CRUD para gerenciamento de tarefas.  
- Proteção de rotas com autenticação baseada em token.  
- Documentação interativa com **Swagger UI**.  
- Configuração flexível para diferentes ambientes de banco de dados.  

---

## 🚀 Como Executar o Projeto  

### 1️⃣ Pré-requisitos  

Certifique-se de ter instalado:  
- **Java 17** ou superior  
- **Maven**  
- **PostgreSQL**  

### 2️⃣ Clone o Repositório  

```bash
git clone https://github.com/Lucassml-boop/Api-list-todo.git
cd Api-list-todo
```

### 3️⃣ Configure o Banco de Dados  

Edite o arquivo `application.properties` com as credenciais do seu banco de dados:  

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 4️⃣ Compile e Execute a Aplicação  

```bash
mvn spring-boot:run
```

A API estará disponível em:  
**http://localhost:8080/api/todos**

---

## 📜 Documentação da API  

Acesse a documentação interativa no Swagger:  
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

1. Autentique-se na rota `/api/auth/login` para obter o token JWT.  
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
│   │   │   ├── com.example.todo/
│   │   │   │   ├── controller/  # Controladores REST
│   │   │   │   ├── model/       # Modelos de dados
│   │   │   │   ├── repository/  # Repositórios JPA
│   │   │   │   ├── service/     # Regras de negócio
│   │   │   │   └── security/    # Configurações de segurança
│   │   ├── resources/
│   │   │   ├── application.properties  # Configurações da aplicação
├── pom.xml  # Dependências do Maven
```

---

## 💡 Diferenciais  

- **Boas práticas**: Código limpo, modular e seguindo princípios de design.  
- **Segurança**: Implementação robusta de autenticação e autorização.  
- **Escalabilidade**: Estrutura preparada para crescimento do projeto.  

---

## 📞 Contato  

Se você gostou deste projeto e deseja saber mais, entre em contato:  
**Email**: lucas.sml@example.com  
**LinkedIn**: [linkedin.com/in/lucassml](https://linkedin.com/in/lucassml)

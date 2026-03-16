# TODO List API

## 📌 Desafio

Esta API para gerenciamento de tarefas (CRUD) foi desenvolvida como parte de um desafio técnico para desenvolvedores backend júnior que desejam se candidatar à Simplify.

O objetivo do projeto é demonstrar conhecimentos em desenvolvimento de APIs REST utilizando o ecossistema do Spring Boot.

---

## 🚀 Tecnologias Utilizadas

* Spring Boot
* Spring MVC
* Spring Data JPA
* SpringDoc OpenAPI
* MySQL

---

## 🧠 Práticas e Conceitos Aplicados

* Princípios **SOLID**
* **DRY** (Don't Repeat Yourself)
* **KISS** (Keep It Simple, Stupid)
* **YAGNI** (You Aren't Gonna Need It)
* Arquitetura **API REST**
* Consultas com **Spring Data JPA**
* **Injeção de Dependências**
* Tratamento de erros da API
* Documentação automática com **Swagger / OpenAPI**

---

## ▶️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone <url-do-repositorio>
```

### 2️⃣ Construir o projeto

```bash
./mvnw clean package
```

### 3️⃣ Executar a aplicação

```bash
java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

---

## 🌐 Acesso à API

A aplicação ficará disponível em:

```
http://localhost:8080
```

Documentação Swagger:

```
http://localhost:8080/swagger-ui.html
```

---

## 📡 Endpoints da API

Para realizar as requisições HTTP foi utilizada a ferramenta **HTTPie**.

---

## ➕ Criar Tarefa

```bash
http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1
```

Resposta:

```json
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

---

## 📋 Listar Tarefas

```bash
http GET :8080/todos
```

Resposta:

```json
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

---

## ✏️ Atualizar Tarefa

```bash
http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2
```

Resposta:

```json
[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```

---

## ❌ Remover Tarefa

```bash
http DELETE :8080/todos/1
```

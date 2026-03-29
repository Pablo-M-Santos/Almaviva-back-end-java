# 🚀 Order Management API

API REST desenvolvida com **Spring Boot** para gerenciamento de pedidos, aplicando boas práticas de arquitetura e **Design Patterns**.

---

## 📌 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de consolidar conhecimentos em:

* Desenvolvimento de APIs REST com Spring Boot
* Aplicação de **Padrões de Projeto (Design Patterns)**
* Boas práticas de arquitetura em camadas
* Testes unitários com JUnit e Mockito

A API permite a criação de pedidos com cálculo de frete baseado no tipo de pedido.

---

## 🧠 Padrões de Projeto Utilizados

* **Strategy** → cálculo de frete por tipo de pedido
* **Factory** → escolha da estratégia correta
* **Chain of Responsibility** *(estrutura preparada para validações futuras)*
* **DTO Pattern** → separação entre camada de entrada/saída e domínio

---

## 🏗️ Arquitetura do Projeto

```
com.order_management_api
 ├── controller       → endpoints REST
 ├── service          → regras de negócio
 ├── repository       → acesso a dados (JPA)
 ├── domain
 │    ├── model       → entidades
 │    ├── dto         → objetos de transferência
 │    └── enums       → enums do sistema
 ├── factory          → fábrica de strategies
 ├── strategy         → regras de cálculo (frete)
 ├── validation       → estrutura para validações (chain)
 └── exception        → tratamento global de erros
```

---

## ⚙️ Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring Data JPA
* H2 Database (em memória)
* Maven
* JUnit 5
* Mockito

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

* Java 17 ou superior
* Maven instalado

---

### ▶️ Executando a aplicação

```bash
mvn clean install
mvn spring-boot:run
```

---

A aplicação estará disponível em:

```
http://localhost:8080
```

---

## 📬 Endpoints

### ➕ Criar Pedido

**POST** `/pedidos`

#### 📥 Request

```json
{
  "valor": 100,
  "tipo": "NORMAL"
}
```

#### 📤 Response

```json
{
  "id": 1,
  "valor": 100,
  "frete": 10,
  "tipo": "NORMAL"
}
```

---

## 🧪 Testes

O projeto possui testes unitários utilizando:

* JUnit 5
* Mockito

### ▶️ Executar testes

```bash
mvn test
```

---

## ⚠️ Tratamento de Erros

A aplicação possui tratamento global de exceções utilizando:

* `@ControllerAdvice`
* Respostas padronizadas para erros

---

## 🔮 Melhorias Futuras

* Documentação com Swagger/OpenAPI
* Integração com banco de dados real (PostgreSQL)
* Autenticação e autorização (Spring Security + JWT)
* Testes de integração
* Deploy em nuvem (AWS / Docker)

---

## 👨‍💻 Autor

Desenvolvido por **Pablinho** 🚀

---

## 📌 Considerações Finais

Este projeto demonstra a aplicação prática de conceitos importantes do ecossistema Java, com foco em código limpo, organização e boas práticas utilizadas no mercado.

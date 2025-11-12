# 🌱 Spring Boot Learning Repository

Welcome to my **Spring Boot Learning Repository!**  
This repo contains examples, notes, and practice projects I’ve built while learning **Spring Boot** and related backend frameworks.

---

## 🧠 Language and Tools
- **Language:** Java  
- **Framework:** Spring Boot  
- **Databases:** MySQL / PostgreSQL  
- **Tools Used:** STS4, IntelliJ IDEA, Postman, Maven

---
# 🧱 CRUD REST API Application

## 📘 About
This is a simple **REST API application** that performs **CRUD (Create, Read, Update, Delete)** operations.  
It demonstrates how to handle data using HTTP methods such as:
- **POST** → Create new data
- **GET** → Retrieve data
- **PUT** → Update existing data
- **DELETE** → Remove data
---

## 🚀 What is Spring Boot?

**Spring Boot** is a Java-based framework designed to simplify the development of **standalone, production-grade Spring applications**.  
It eliminates boilerplate configuration and provides built-in support for **embedded servers**, making it extremely easy to get started with minimal setup.

### ✨ Key Features of Spring Boot
- **Auto Configuration:** Automatically configures your project based on added dependencies.  
- **Embedded Servers:** No need for external servers — uses **Tomcat**, **Jetty**, or **Undertow**.  
- **Production Ready:** Built-in tools for **health checks**, **metrics**, and **monitoring**.  
- **Spring Initializr:** Quickly create new Spring Boot projects with required dependencies.  
- **Dependency Management:** Uses “starter” dependencies (like `spring-boot-starter-web`) to simplify configuration.

### 🧩 What’s Inside Spring Boot
Spring Boot internally includes several modules:
- **Spring Core** – Provides dependency injection and core container features.  
- **Spring MVC** – Supports building RESTful APIs and web apps.  
- **Spring Data JPA** – Handles database operations and ORM mapping.  
- **Spring Security** – Adds authentication and authorization layers.  
- **Spring Boot Actuator** – Offers health and performance monitoring endpoints.  

---

## 🧰 What is Postman?

**Postman** is a powerful API testing and collaboration tool used by developers to test, debug, and document RESTful APIs.  
It helps verify that your **Spring Boot backend** endpoints are working correctly before connecting them to a frontend or mobile app.

---

### 🔍 Why Developers Use Postman
- 🧪 **Test REST APIs easily:** You can send HTTP requests like `GET`, `POST`, `PUT`, `DELETE` and instantly see the server’s response.  
- ⚙️ **Check response data:** View status codes, headers, and JSON responses clearly.  
- 🔐 **Handle authentication:** Supports API keys, Bearer tokens, Basic Auth, and OAuth.  
- 🧰 **Environment variables:** Define variables (like base URLs or tokens) for different setups — *development*, *testing*, *production*.  
- 📦 **Collections:** Organize multiple API requests into folders, making it easy to manage large projects.  
- 💾 **Export & Share:** You can share your API tests with teammates or import/export as JSON files.  
- 🔄 **Automated Testing:** You can create scripts using JavaScript inside Postman for automation or CI/CD testing.

---

### 🧪 Example Usage with Spring Boot
1. **Run your Spring Boot app** → usually runs at `http://localhost:8080/`
2. **Open Postman** → Create a new request tab
3. **Choose a method** (like `GET`, `POST`, `PUT`, or `DELETE`)
4. **Enter your endpoint**, for example:
   - `GET http://localhost:8080/Earth`
   - `POST http://localhost:8080/Earth`
5. **For POST/PUT**, go to the **Body** tab → select **raw → JSON** → and type:
   ```json
   {
     "name": "Pirate",
     "tech": "Java",
     "aid": 101
   }


---

### 💫 About Me
- 🌱 I love learning and building web applications  
- ✨ Currently working on projects about environment & awareness  
- 🎯 Interested in Java, Spring Boot, Frontend & API development  
- 📚 Always exploring new technologies to grow  

## 🗄️ What is JPA (Java Persistence API)?

**JPA** is a specification that allows you to manage relational data in Java applications.  
It defines how Java objects (entities) are mapped to database tables.

### ⚙️ Why Use JPA
- Simplifies database operations (CRUD) using objects instead of SQL queries.  
- Works with ORM frameworks like **Hibernate** for automatic SQL generation.  
- Allows easy data persistence and retrieval using **Repository Interfaces**.

---

### 💡 Example
```java
public interface HumanRepo extends JpaRepository<Human, Integer> {
    List<Human> findByTech(String tech);
    List<Human> findByAidGreaterThan(int aid);
    
    @Query("from Human where tech=?1 order by name")
    List<Human> findByTechSorted(String tech);
}



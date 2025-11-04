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

### What is Postman? 

---

## 🗄️ What is JPA (Java Persistence API)?

**JPA** is a specification that allows you to manage relational data in Java applications.  
It defines how Java objects (entities) are mapped to database tables.

### ⚙️ Why Use JPA
- Simplifies database operations (CRUD) using objects instead of SQL queries.  
- Works with ORM frameworks like **Hibernate** for automatic SQL generation.  
- Allows easy data persistence and retrieval using **Repository Interfaces**.

### 💡 Example
```java
public interface HumanRepo extends JpaRepository<Human, Integer> {
    List<Human> findByTech(String tech);
    List<Human> findByAidGreaterThan(int aid);
    
    @Query("from Human where tech=?1 order by name")
    List<Human> findByTechSorted(String tech);
}

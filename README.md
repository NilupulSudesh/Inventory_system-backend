# Inventory System - Backend

This is the backend service for the Inventory Management System, built using **Spring Boot**.  
It provides RESTful APIs to manage products, users, authentication, and inventory operations.

---

## 🚀 Features

- User Authentication (JWT / Token-based)
- Product Management (CRUD operations)
- Category Management
- Stock Management
- Secure API endpoints
- Exception handling
- Layered architecture (Controller, Service, Repository)

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- Hibernate
- MySQL / PostgreSQL
- Maven

---
## application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

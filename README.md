﻿# 📘 RESTful Bookstore API

**Elevate Internship Project (Java Backend)**  
Developed as part of the **Elevate Labs Internship Program**, this project demonstrates building a RESTful backend using **Spring Boot**, **MySQL**, **JPA**, **DTOs**, and **Swagger UI**.

---

### 🧰 Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- OpenAPI
- Postman

---

### 🎯 Project Objective

To build a clean, modular, and scalable **RESTful API** for managing **books** and **authors**, with production-grade practices such as:
- DTO usage to separate domain logic from API payloads
- Integration with a relational database (MySQL)
- Filtering, pagination, and sorting
- OpenAPI/Swagger documentation
- Tested via Postman

---

### 🗂️ Folder Structure

src/main/java/com/example/bookstore<br>
├── controller → API endpoints<br>
├── dto → Data Transfer Objects<br>
├── entity → JPA entity classes<br>
├── repository → Spring Data JPA interfaces<br>
├── service → Business logic<br>
├── BookstoreApiApplication.java

---

### 🚀 Running the Application

#### ✅ Step 1: Set up MySQL

```sql
CREATE DATABASE Bookstore;
```
✅ Step 2: Configure application.properties
``````
properties 

spring.datasource.url=jdbc:mysql://localhost:3306/Bookstore?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
``````
✅ Step 3: Run the app
````````
mvn spring-boot:run
````````
🧪 Sample APIs (Test with Postman or Swagger)<br>
➕ Add Author (POST)<br>
/api/authors
``````
{
"name": "J.K. Rowling"
}
``````
➕ Add Book (POST)<br>
/api/books
``````
{
  "title": "Harry Potter",
  "genre": "Fantasy",
  "price": 499.99,
  "authorId": 1
}
``````
📚 Get All Books (GET)<br>
/api/books?genre=Fantasy&page=0&size=5&sortBy=title

### 📦 Features<br>
- CRUD operations for Books and Authors
    
- DTO separation for API design
    
- Pagination, filtering, sorting
    
- MySQL database with auto schema creation

### ✨ Project Status
    ✅ Functional
    🧪 Tested with Postman
    📌 Ready to deploy or extend
👨‍💻 Author
    Ankit Vishwakarma<br>
    Elevate Internship — Java Backend Developer<br>
    🔗 GitHub Profile - https://github.com/ankitv26 <br>
    🔗 LinkedIn - https://www.linkedin.com/in/ankit-vishwakarma-527941250?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app


### 📢 Note
#### This project was completed as part of the Elevate Internship Program to demonstrate my backend development skills using modern Java and Spring Boot practices.


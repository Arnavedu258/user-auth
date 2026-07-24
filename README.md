# 🔐 Enterprise User Authentication System

> A secure, session-based authentication system built using Java Servlets, JSP, JDBC, and MySQL following the MVC architecture. This project demonstrates authentication workflows commonly used in enterprise Java web applications.

![Java](https://img.shields.io/badge/Java-17-red)
![JSP](https://img.shields.io/badge/JSP-Jakarta-blue)
![Servlet](https://img.shields.io/badge/Servlet-Jakarta-orange)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![JDBC](https://img.shields.io/badge/JDBC-Database-green)
![Tomcat](https://img.shields.io/badge/Apache-Tomcat-yellow)
![License](https://img.shields.io/badge/License-MIT-brightgreen)

---

# Overview

This project implements a secure authentication workflow for enterprise Java applications using the Servlet-JSP architecture.

It demonstrates industry-standard backend development concepts including request processing, session handling, database persistence, input validation, and secure database communication using JDBC.

The application follows the Model-View-Controller (MVC) design pattern to ensure maintainability, scalability, and separation of concerns.

---

# Features

- Secure User Registration
- User Login Authentication
- Session-Based Authentication
- Persistent User Storage (MySQL)
- JDBC Prepared Statements
- MVC Architecture
- Form Validation
- Duplicate User Prevention
- Logout & Session Invalidation
- Modular Code Structure
- Exception Handling
- Database Connection Layer
- Clean Project Architecture

---

# Architecture

```
                   Client Browser
                          │
                          ▼
                   JSP Presentation Layer
                          │
                          ▼
                    Servlet Controller
                          │
                          ▼
                  Business Logic Layer
                          │
                          ▼
                   JDBC Data Access Layer
                          │
                          ▼
                     MySQL Database
```

---

# Technology Stack

## Backend

- Java
- JSP
- Jakarta Servlet
- JDBC

## Database

- MySQL

## Build Tools

- Eclipse Dynamic Web Project

## Web Server

- Apache Tomcat 10

---

# Project Structure

```
User-Authentication-System
│
├── src
│   ├── controller
│   │      LoginServlet.java
│   │      RegisterServlet.java
│   │
│   ├── dao
│   │      LoginDAO.java
│   │      RegisterDAO.java
│   │
│   ├── database
│   │      ConnectionFactory.java
│   │
│   ├── model
│   │      User.java
│   │
│   └── service
│
├── WebContent
│   ├── login.jsp
│   ├── register.jsp
│   ├── dashboard.jsp
│   ├── logout.jsp
│   ├── css
│   └── images
│
├── database.sql
│
└── README.md
```

---

# Authentication Flow

```
Register User
      │
      ▼
Validate Input
      │
      ▼
Store User in MySQL
      │
      ▼
Login Request
      │
      ▼
Authenticate Credentials
      │
      ▼
Create HTTP Session
      │
      ▼
Protected Dashboard
      │
      ▼
Logout
      │
      ▼
Invalidate Session
```

---

# Database Schema

```sql
CREATE DATABASE loginuser;

USE loginuser;

CREATE TABLE login (

    id INT AUTO_INCREMENT PRIMARY KEY,

    username VARCHAR(100) UNIQUE NOT NULL,

    password VARCHAR(255) NOT NULL,

    email VARCHAR(120) UNIQUE NOT NULL

);
```

---

# Key Engineering Concepts

- MVC Architecture
- HTTP Request Lifecycle
- Session Management
- JDBC Connection Pooling (Extensible)
- SQL Prepared Statements
- Authentication Workflow
- Data Validation
- Object-Oriented Programming
- Exception Handling
- Modular Design

---

# Security Practices

✔ Prepared Statements (SQL Injection Protection)

✔ Session Management

✔ Server-side Validation

✔ Duplicate User Validation

✔ Database Isolation

---

# Setup Instructions

### Clone Repository

```bash
git clone https://github.com/Arnavedu258/user-auth.git
```

### Configure MySQL

Create the database using

```
database.sql
```

Update database credentials inside

```
ConnectionFactory.java
```

### Run

- Import project into Eclipse
- Configure Apache Tomcat
- Add MySQL Connector/J
- Deploy on Tomcat
- Visit

```
http://localhost:8080/User-Authentication-System
```

---

# Future Improvements

- BCrypt Password Hashing
- JWT Authentication
- Spring Boot Migration
- Spring Security
- Remember Me
- Email Verification
- Password Reset
- Role-Based Access Control (RBAC)
- OAuth2 Login
- Docker Deployment
- Unit Testing (JUnit)
- CI/CD Pipeline
- Redis Session Store

---

# Learning Outcomes

This project demonstrates practical experience with

- Enterprise Java Development
- Servlet API
- MVC Architecture
- Database Integration
- Authentication Systems
- Session Handling
- Backend Engineering Principles

---

# Screenshots

- Login Page
- Registration Page
- Dashboard
- Successful Authentication
- Logout

*(Add screenshots here)*

---

# Author

**Arnave Dubey**

Backend Developer | Java Developer

GitHub: https://github.com/Arnavedu258

LinkedIn: https://linkedin.com/in/your-profile

---

## Star the repository if you found it useful.

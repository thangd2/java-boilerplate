# Java Boilerplate (Spring Boot Starter Project)

A clean, modular **Spring Boot boilerplate** for building scalable backend services.  
This project includes **JWT authentication**, **user management**, **layered architecture (Controller–Service–Repository)**, **BCrypt password hashing**, and ready-to-extend base classes for rapid development.

---

## 🚀 Features

- ✅ Spring Boot 3.x with Maven  
- ✅ RESTful API structure  
- ✅ User registration & authentication (JWT-based)  
- ✅ BCrypt password encryption  
- ✅ Global exception handling  
- ✅ Layered architecture (Controller / Service / Repository)  
- ✅ Base entity with auditing fields (`createdAt`, `updatedAt`, etc.)  
- ✅ CORS and Security configuration ready  

---

## 📂 Project Structure

```
src/
 ├── main/
 │   ├── java/com/example/demo/
 │   │   ├── controller/       # REST controllers
 │   │   ├── service/          # Business logic
 │   │   ├── service/impl/     # Service implementations
 │   │   ├── model/            # JPA entities
 │   │   ├── repository/       # Spring Data JPA repositories
 │   │   ├── dto/              # Request/Response DTOs
 │   │   └── security/         # JWT & Security config
 │   └── resources/
 │       ├── application.yml   # Configuration file
 │       └── data.sql          # Optional seed data
 └── test/                     # Unit & integration tests
```

---

## 🧰 Requirements

- **Java 17+**
- **Maven 3.8+**
- **Spring Boot 3.x**
- **H2 / MySQL / PostgreSQL** (depending on configuration)

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/java-boilerplate.git
cd java-boilerplate
```

### 2️⃣ Configure application.yml
Edit your database connection inside `src/main/resources/application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/demo_db
    username: root
    password: password
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

### 3️⃣ Build the project
```bash
mvn clean install
```

### 4️⃣ Run the application
```bash
mvn spring-boot:run
```

The server will start on **http://localhost:8080**

---

## 🔑 API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| POST | `/api/authentications/login` | Login with email & password |
| POST | `/api/authentications/refresh` | Get new access token |
| POST | `/api/users` | Create new user |
| GET | `/api/users/{id}` | Get user details |

Example login request:
```json
{
  "email": "admin@example.com",
  "password": "123456"
}
```

---

## 🧠 Tech Stack

- **Spring Boot**
- **Spring Security (JWT)**
- **Spring Data JPA**
- **Lombok**
- **Jakarta Persistence**
- **BCrypt**

---

## 🤝 Contributing

1. Fork the repo  
2. Create a feature branch (`git checkout -b feature/new-feature`)  
3. Commit your changes (`git commit -m 'Add new feature'`)  
4. Push to branch (`git push origin feature/new-feature`)  
5. Create a Pull Request  

---

## 📜 License

This project is released under the **MIT License**.

---

**Author:** Thang Doan  
**Repository:** [https://github.com/thangd2/java-boilerplate](https://github.com/thangd2/java-boilerplate)

# Cloud Vendor Project

This project is a basic backend implementation built using **Java**, **Spring Boot**, **Spring Data JPA**, and **RESTful APIs**, with **MySQL** as the database. The API endpoints are tested using **Postman**.

## 📁 Project Structure

```
cloud-vendor/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── himakar/
│   │   │           ├── controller/     # Handles HTTP requests and responses
│   │   │           ├── model/          # Contains Entity classes
│   │   │           ├── repository/     # JPA repositories for data access
│   │   │           └── service/        # Business logic layer
│   │   └── resources/
│   │       └── application.properties  # MySQL database configuration
├── pom.xml                            # Maven configuration and dependencies
```

## ✅ Features

- CRUD operations on cloud vendor data
- Layered architecture (Controller, Service, Repository)
- Entity mapping using JPA
- RESTful API design using:
  - `GET` – Retrieve resources
  - `POST` – Create resources
  - `PUT` – Update resources
  - `DELETE` – Remove resources
- MySQL integration with Spring Data JPA
- Configurable database settings via `application.properties`
- API tested using Postman

## 🛠️ Tech Stack

- **Language**: Java
- **Framework**: Spring Boot
- **Persistence**: Spring Data JPA
- **Database**: MySQL
- **API Tool**: Postman
- **Build Tool**: Maven

## 🔧 Configuration

Make sure to update the `application.properties` file with your MySQL credentials and connection details.

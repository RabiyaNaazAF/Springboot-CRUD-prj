
# 🛠️ Spring Boot CRUD API with MySQL

This project is a **Spring Boot** application that demonstrates CRUD (Create, Read, Update, Delete) operations on a **MySQL** database using **Spring Data JPA**. Tested via **Postman** and managed with **MySQL Workbench**, it’s built entirely from scratch.
---

## Screenshots
🔌 1. Postman – Sample GET Request

<img width="1362" height="866" alt="image" src="https://github.com/user-attachments/assets/6a0e9b97-4f59-4649-9cb0-09ff98c3bf4c" />

---

🏗️ 2. MySQL Workbench – Entity Table Preview

<img width="1534" height="648" alt="image" src="https://github.com/user-attachments/assets/8cd585cc-6d84-45d1-8b04-120de8d1cabc" />


---

## ✅ Features

- RESTful API endpoints for full CRUD operations.
- MySQL integration for persistent storage.
- Simple, layered architecture: Controller → Service → Repository → Entity.
- Input data handling and database mapping via Spring Data JPA.
- Tested using Postman to ensure proper functionality.

---

## ⚙️ Prerequisites

- Java 11 or later
- Maven
- MySQL server + MySQL Workbench
- Postman

---

## 🚀 Setup Instructions

1. **Clone the repository**

   ```bash
   git clone https://github.com/RabiyaNaazAF/Springboot-CRUD-prj.git
   cd Springboot-CRUD-prj

## Project Structure

src/
 ├─ main/
 │   ├─ java/com/<your_package>/
 │   │   ├─ controller/   ← REST API endpoints
 │   │   ├─ service/      ← Business logic
 │   │   ├─ repository/   ← Spring Data JPA interfaces
 │   │   └─ entity/       ← JPA Entity classes
 │   └─ resources/
 │       ├─ application.properties
 │       └─ ... 
└─ pom.xml


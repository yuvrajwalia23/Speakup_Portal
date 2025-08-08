# SpeakUp Portal 🗣️

A lightweight Complaint Management Portal built using Spring Boot, JWT Authentication, MySQL, and a responsive frontend using HTML/CSS/JavaScript.

## 🚀 Features

- ✅ User Registration & Login (with JWT Auth)
- 🙋 User Dashboard to submit and track complaints
- 🛠️ Admin Dashboard to manage all complaints
- 🔒 Role-based Access Control (`USER`, `ADMIN`)
- 📦 RESTful APIs
- 🎨 Light-themed UI with animations and clean layout
- 📁 Modular Backend Architecture

---

## 🛠️ Tech Stack

____________________________________________________
| Layer      | Technology                           |
|------------|--------------------------------------|
| Backend    | Spring Boot, JWT, Spring Security    |
| Database   | MySQL                                |
| Frontend   | HTML, CSS (Light Themed), JavaScript |
| API Style  | RESTful                              |
-----------------------------------------------------

---

## 📂 Project Structure

```
complaintportal/
├── src/
│   ├── main/
│   │   ├── java/com/example/complaintportal/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── security/
│   │   │   └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           ├── index.html
│   │           ├── login.html
│   │           ├── register.html
│   │           ├── user-dashboard.html
│   │           ├── admin-dashboard.html
│   │           └── style.css
├── pom.xml
└── README.md
```

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/yuvrajwalia23/Speakup_Portal.git
cd Speakup_Portal
```

### 2. Configure MySQL

Create a database called:

```sql
CREATE DATABASE complaint_portal;
```

Update credentials in `src/main/resources/application.properties`:

```properties
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```

### 3. Run the Spring Boot App

```bash
./mvnw spring-boot:run
```

Backend runs at: `http://localhost:8080`

---

## 🌐 API Endpoints

| Method | Endpoint                         | Description                |
|--------|----------------------------------|----------------------------|
| POST   | `/auth/register`                 | Register user              |
| POST   | `/auth/login`                    | Authenticate user & get JWT|
| POST   | `/api/complaints/{userId}`       | Submit a complaint         |
| GET    | `/api/complaints/user/{userId}`  | View user's complaints     |
| GET    | `/api/complaints`                | View all complaints (Admin)|
| PUT    | `/api/complaints/{id}`           | Mark complaint resolved    |
| DELETE | `/api/complaints/{id}`           | Delete complaint (Admin)   |

---

## 🧪 Sample Credentials

- 👨‍💼 Admin
  - Email: `admin@speakup.com`
  - Password: `admin123`

- 🙋 User
  - Register via `/auth/register` or from UI

---

## 🎨 Screens

|                         User Dashboard                       |                        Admin Dashboard                      |
|--------------------------------------------------------------|-------------------------------------------------------------|
|(https://via.placeholder.com/300x150.png?text=User+Dashboard) | (https://via.placeholder.com/300x150.png?text=Admin+Dashboard) |


---

## ✍️ Author

**Yuvraj Singh Walia**  
[GitHub](https://github.com/yuvrajwalia23) | [LinkedIn](https://www.linkedin.com/in/yuvraj-walia-2023xyz/)

---

## 📃 License

This project is open-sourced under the MIT License.
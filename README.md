# 🚀 Hibernate CRUD Application

A console-based Java application that performs Create, Read, Update, and Delete (CRUD) operations using **Hibernate ORM** and **MySQL**.

This project follows the **DAO (Data Access Object) design pattern** and demonstrates how Hibernate maps Java objects to database tables.

---

## 📌 Features

- Create new student records
- Read student details by ID
- Update student marks
- Delete student records
- Menu-driven console interface
- Clean layered architecture (Entity → DAO → Main)

---

## 🛠️ Tech Stack

- Java 8+
- Hibernate ORM 5.6
- MySQL
- Maven
- Eclipse IDE

---
HibernateCRUD/
│── src/main/java/com/entity/Student.java
│── src/main/java/com/dao/StudentDAO.java
│── src/main/java/com/util/HibernateUtil.java
│── src/main/java/com/app/MainApp.java
│── src/main/resources/hibernate.cfg.xml
│── pom.xml
│── .gitignore


---

## 🗄️ Database Setup

Run the following in MySQL:

```sql
CREATE DATABASE hibernate_crud;

USE hibernate_crud;

CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    marks DOUBLE
);
⚙️ Configuration

Update your database credentials inside:

src/main/resources/hibernate.cfg.xml

Example:

<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">yourpassword</property>
▶️ How to Run

Clone the repository

Open in Eclipse as Maven project

Update Maven dependencies

Configure MySQL

Run MainApp.java

🧠 What I Learned

Hibernate configuration using XML

Entity mapping using JPA annotations

Session & Transaction management

DAO design pattern

Console-based menu-driven application

Git & GitHub version control

👨‍💻 Author

Umesh D C
GitHub: https://github.com/UmeshDc13

## 📂 Project Structure

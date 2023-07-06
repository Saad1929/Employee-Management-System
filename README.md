# Employee Management System Backend - Spring Boot & MySQL
- **Frontend Component** using **React** is located here: https://github.com/Saad1929/Employee-Management-Frontend
## Brief Summary
- I developed a **RESTful API** using **Spring Boot and MySQL for the backend**, tested it with **Postman**, and integrated it into a **React frontend using axios**.
- **CREATE, READ, UPDATE and DELETE (CRUD)** appliction.
- This repository contains the **backend** of a **Full Stack** **personal project**, which is **responsible for storing employee information** and is implemented using the **Spring Boot Java Framework** which serves as the **web framework** for the **backend**.
- This application allows users to **view, add, remove, and edit** individuals within their management system.
## 🎯Aims and Motivation
- The main objective of this project was to create a thorough **Full Stack Application** using **Spring Boot & MySQL** as the **backend** and **React** as the **frontend**.
- Driven by an **unwavering enthusiasm** for **learning and self-improvement**, I dedicated my **personal time** to meticulously **develop and refine this Full Stack Application**.
## ⚙️Technologies, Requirements and Software Tools
- Requirements listed below are for the **frontend and backend**.
### Programming and Scripting Languages
- Java
- JavaScript
- HTML
- CSS
- JSON
### Frameworks & Libraries
- Spring Boot - **Backend**
- React - **Frontend**
- Bootstrap - **Frontend & Backend**
### npm Requirements (React)
- nmp axios
- npm react-router-dom
### Other Software Tools
- **MySQLWorkbench** played a role where the **backend** relied on this technology to **store user information**.
- **DataGrip** was also used to support the **backend** in storing user information.
- **Postman** was used to **test PUT, GET, POST and DELETE requests to the database**.
## ✏️Design - Backend
### Backend Technology Stack
- **Java** served as the **backend programming language** for the web application, while the **Spring Boot framework** was employed to **facilitate its development and operation**.
- **Spring Boot** was utilised to **create user models**, which were subsequently employed to **store employee information in the database**. The user models were established using the **Jakarta Persistence import** and **annotations**, including **@Entity, @Id, and @GeneratedValue**. This approach **facilitated the maintenance of the REST API**, making it more manageable and easier to maintain in the long run.
- **MySQL Workbench and DataGrip** were employed to **store employee information**. The **backend**, developed with **Spring Boot**, was **configured to connect with the database**, while the **frontend**, built with **React**, was responsible for **retrieving and displaying** this information.
- **Spring Boot** was additionally utilised to **create custom exceptions**, specifically designed for **handling scenarios where the user ID was not found or encountered other exceptional conditions**.
#### React & Spring Boot Summarisation Diagram

![spring-boot-react-crud-example-rest-api-architecture](https://github.com/Saad1929/Employee-Management-System/assets/108022733/72a0af45-30b9-43b2-81ef-4a66b17ecbb9)

### Postman and Testing Sceenshots
- **Postman** was used as an **API platform** to **design, build, test and iterate** the **RESTful API** which was **built using Spring Boot**.
- Requests were dealt in **JSON** and **SQL**.
#### GET Request (Normal Case) 
<img width="800" alt="GET" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/bfc2a4d1-598f-4753-a243-359f74f2bafb">

#### GET Request (Exceptional Case)
- The customer error handling implemented in the Spring Boot backend works successfully, as evidenced by the appropriate handling of the situation where a user with an ID of 20 does not exist.
  <img width="800" alt="GET ERROR" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/04da1212-cf5d-40da-a2a0-704e64ce3c56">

#### PUT Request (Normal Case)
<img width="800" alt="PUT" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/c092edf5-5518-4f2f-9b84-aebe1ac196bc">

#### DELETE Request (Exceptional Case)
<img width="800" alt="DELETE ERROR" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/cdb5d84d-06b1-4330-995e-fc8b12e63003">

#### POST Request (Normal Case)
<img width="800" alt="Get   Post" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/7902b5ae-07d0-480c-8961-b2a5f2c11535">

#### Postman Summarisation Diagram
<img width="700" alt="Get   Post" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/55ded7ac-d37d-4507-aebb-0209852de730">

# Employee Management System Back-end - Spring Boot & MySQL
- **Front-end Component** using **React** is located here: https://github.com/Saad1929/Employee-Management-Frontend
## Contents
1. [ Brief Summary ](#summary)
2. [ Aims and Motivation ](#aims)
3. [ Technologies, Requirements and Software Tools ](#tech)
4. [ Design ](#design)
5. [ Application Screenshots ](#demo)

<a name="summary"></a>
## Brief Summary
- I developed a **RESTful API** using **Spring Boot and MySQL for the back-end**, tested it with **Postman**, and integrated it into a **React front-end using axios**.
- **CREATE, READ, UPDATE and DELETE (CRUD)** appliction.
- This repository contains the **back-end** of a **Full Stack** **personal project**, which is **responsible for storing employee information** and is implemented using the **Spring Boot Java Framework** which serves as the **web framework** for the **back-end**.
- This application allows users to **view, add, remove, and edit** individuals within their management system.
- This project is now **fully utilised** by my **community's sports club**.
<a name="aims"></a>
## 🎯Aims and Motivation
- The main objective of this project was to create a thorough **Full Stack Application** using **Spring Boot & MySQL** as the **back-end** and **React** as the **front-end**.
- Driven by an **unwavering enthusiasm** for **learning and self-improvement**, I dedicated my **personal time** to meticulously **develop and refine this Full Stack Application**.
<a name="tech"></a>
## ⚙️Technologies, Requirements and Software Tools
- Requirements listed below are for the **front-end and back-end**.
### Programming and Scripting Languages
- Java
- JavaScript
- HTML
- CSS
- JSON
### Frameworks & Libraries
- Spring Boot - **Back-end**
- React - **Front-end**
- Bootstrap - **Front-end & Back-end**
### npm Requirements (React)
- nmp axios
- npm react-router-dom
### Other Software Tools
- **MySQLWorkbench** played a role where the **back-end** relied on this technology to **store user information**.
- **DataGrip** was also used to support the **back-end** in storing user information.
- **Postman** was used to **test PUT, GET, POST and DELETE requests to the database**.
<a name="design"></a>
## ✏️Design - Back-end
### Back-end Technology Stack
- **Java** served as the **back-end programming language** for the web application, while the **Spring Boot framework** was employed to **facilitate its development and operation**.
- **Spring Boot** was utilised to **create user models**, which were subsequently employed to **store employee information in the database**. The user models were established using the **Jakarta Persistence import** and **annotations**, including **@Entity, @Id, and @GeneratedValue**. This approach **facilitated the maintenance of the REST API**, making it more manageable and easier to maintain in the long run.
- **MySQL Workbench and DataGrip** were employed to **store employee information**. The **back-end**, developed with **Spring Boot**, was **configured to connect with the database**, while the **front-end**, built with **React**, was responsible for **retrieving and displaying** this information.
- **Spring Boot** was additionally utilised to **create custom exceptions**, specifically designed for **handling scenarios where the user ID was not found or encountered other exceptional conditions**.
#### React & Spring Boot Summarisation Diagram

![spring-boot-react-crud-example-rest-api-architecture](https://github.com/Saad1929/Employee-Management-System/assets/108022733/9951b53f-cf9c-4bf8-830f-654fa135789f)


### Postman and Testing Sceenshots
- **Postman** was used as an **API platform** to **design, build, test and iterate** the **RESTful API** which was **built using Spring Boot**.
- Requests were dealt in **JSON** and **SQL**.
#### GET Request (Normal Case) 
<img width="800" alt="GET" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/6f37bf38-071f-4d61-b4a7-7569e4730129">


#### GET Request (Exceptional Case)
- The customer error handling implemented in the Spring Boot back-end works successfully, as evidenced by the appropriate handling of the situation where a user with an ID of 20 does not exist.
<img width="800" alt="GET ERROR" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/ec068261-bc66-4f0e-b36f-d38889d2ae12">


#### PUT Request (Normal Case)
<img width="1440" alt="PUT" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/2d978d20-75d9-43a1-96e2-d05f067df848">


#### DELETE Request (Exceptional Case)
<img width="800" alt="DELETE ERROR" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/7c54018f-ee71-4e11-a222-70e17cd6970a">


#### POST Request (Normal Case)
<img width="800" alt="Get   Post" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/ada4d1d1-fc66-4223-ac29-434f0d8fc446">


#### Postman Summarisation Diagram
![postman](https://github.com/Saad1929/Employee-Management-System/assets/108022733/e045a6d9-48a6-46d8-8c78-daa6cb444606)


<a name="demo"></a>
## Application Screenshots
### Home Page 
<img width="800" alt="Home Page" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/4d545b20-5119-4de1-a8e4-f9146811c9ac">


### Register User Page
<img width="800" alt="Register User Page" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/ff73e389-5e45-4b0d-ac50-921d58c4e570">


### View User Details Page
<img width="800" alt="View User Details Page" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/4edc3800-24a3-4753-9c3c-e1167b779352">


### Edit User Page
<img width="800" alt="Edit User Page" src="https://github.com/Saad1929/Employee-Management-System/assets/108022733/61cf2427-57ec-42bf-8bda-77dab6c32c4d">



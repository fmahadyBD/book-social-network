## 


# **Book Social Network (BSN)**

## **Concepts**

### **Book Management**
- Users can create, update, and delete books.
- Each book should have attributes like title, author, genre, description, etc.
- Implement CRUD operations for books on both the backend and frontend.
- Users can archive books they no longer want to share but wish to keep a record of.

### **Book Sharing**
- Users can mark a book as "available for sharing."
- Other users can view the list of available books.
- Implement functionality to share a book with another user.

### **Book Borrowing**
- Users can borrow a book.
- Track the status of each book (available, borrowed, archived).
- Implement a mechanism to prevent multiple users from borrowing the same book **simultaneously**.

### **User Authentication**
- Implement user registration and login functionality.
- Use Spring Security for backend authentication.
- Integrate JWT for secure token-based authentication between Spring Boot and Angular.

---

## **Diagrams**

### **Class Diagram**
![Class Diagram](/xdiagrams/class-diagram.png)

---
### **Database Design**


---
### **Security Diagram**
![Security Diagram](/xdiagrams/security.png)

**Note:**
- Request 

---

## **Technology Used**

### **Backend (Book Networking)**
- **Spring Boot**
- **Spring Security**
- **JWT Authentication**
- **Spring Data JPA**
- **JSR-303 (Validation)**
- **Spring Validation**
- **Documentation: OpenAPI and Swagger UI**
- **Docker**
- **Git & GitHub**
- **CI/CD: GitHub Actions**
- **Keycloak** (for authentication and authorization management)

---

### Thank you Bouali Ali


## How To Run the Docker Composer:

docker compose up -d

## How to get access the databases of the:

docker exec -it c0a0fb454f05 mysql -u root -p
[Docker id]
Password will be:  MYSQL_ROOT_PASSWORD: rootpassword

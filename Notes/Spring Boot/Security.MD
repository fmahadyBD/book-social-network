
### **Security Diagram**
![Security Diagram](/xdiagrams/security.png)
---

# **User Authentication Flow**

In our application, the user authentication process is handled through a series of steps triggered by an HTTP request.

### **1. Request Handling & Filters**

- A user sends a request, which is intercepted by our custom filter chain.
- The filter we use is called `OnceRequestFilter`.
- The filter checks if a valid token is present in the request header. If the token exists, the process continues to the next step; otherwise, an error response is returned.

### **2. Token Validation**

- If the token is **not valid** (i.e., not found or expired), the application throws an exception and responds with an error.
- If the token is found and is valid, the system proceeds to call the `UserDetailsService` class to fetch the user's information (e.g., user details based on the token).

### **3. User Lookup**

- The `UserDetailsService` class uses the token to fetch user information, such as the user's email address.
- If the user is **not found**, an exception is thrown.
- If the user is found, the authentication process continues and updates the security context.

### **4. Security Context Holder**

- The **Security Context Holder** is updated with the authentication details.
    - **Principal**: The user's authentication (this identifies the user).
    - **Credentials**: The user's credentials (such as their password or token).
    - **Authorities**: Role-based authentication (such as `ADMIN`, `USER`, etc.).

### **5. Dispatcher Service**

- Once the security context is updated, the `DispatcherService` is called to decide which controller or endpoint should handle the request.

---

### **Summary Flow:**
1. User sends an HTTP request.
2. `OnceRequestFilter` checks the token.
3. Token is validated:
   - If valid, `UserDetailsService` fetches user details.
   - If invalid, return error.
4. Security context is updated with the user's details (authentication, credentials, and roles).
5. The request is routed to the appropriate controller via `DispatcherService`.

---




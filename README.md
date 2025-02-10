

---

# 🌐 Connectly - Social Media Backend

Welcome to the **Connectly** backend! This repository serves as the core backend system for Connectly, a social media platform where users can connect, share, and communicate in real time. Built with **Spring Boot** for efficient REST API services, this backend handles everything from user management to secure messaging.

## 🚀 Features

- **User Authentication & Authorization**: Secure login and registration with **Spring Security** and **JWT**.
- **Post Management**: Full CRUD operations for user posts, including media attachments.
- **Messaging**: Real-time private messaging between users.
- **Friendships**: Manage friend requests and connections.
- **Commenting & Liking**: Interactions on posts with like and comment features.
- **Search Functionality**: Efficient search for users and posts.

## 🛠 Tech Stack

- **Framework**: Spring Boot
- **Database**: MySQL
- **Security**: Spring Security and JWT for authentication and authorization
- **RESTful Services**: REST APIs for seamless front-end integration
- **Build Tool**: Maven for dependency management and builds

## 📂 Project Structure

- **/src/main/java**
  - **/controller**: Handles incoming API requests for entities like User, Post, and Messages.
  - **/service**: Business logic for each feature.
  - **/repository**: Database access layers using Spring Data JPA.
  - **/model**: Entities representing database tables (User, Post, Message, etc.).
  - **/config**: Configuration files, including Spring Security and JWT setup.

## ⚙️ Getting Started

### Prerequisites

- **Java** (JDK 11 or above)
- **MySQL** (Ensure the MySQL server is running)
- **Maven**

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/pranav-gupta12/Social-media-backend.git
   cd Social-media-backend
   ```

2. **Configure Database**  
   Update `application.properties` in `src/main/resources` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/connectly
   spring.datasource.username=your_db_username
   spring.datasource.password=your_db_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Install dependencies and build**
   ```bash
   mvn clean install
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

## 🎯 API Endpoints

- **User Management**
  - `POST /api/v1/auth/register`: Register a new user
  - `POST /api/v1/auth/login`: User login
- **Post Operations**
  - `GET /api/v1/posts`: Retrieve all posts
  - `POST /api/v1/posts`: Create a new post
- **Messages**
  - `POST /api/v1/messages`: Send a message
  - `GET /api/v1/messages/{userId}`: Retrieve messages for a specific user


> Full documentation of API endpoints can be found [here](docs/API_DOCUMENTATION.md).

## 🔒 Security

Connectly's backend uses **JWT** tokens to secure endpoints, ensuring only authenticated users have access to sensitive data. Spring Security configurations handle role-based access control for additional protection.

## 📈 Future Enhancements

- **Group Chat**: Enabling multiple users in a chat.
- **Activity Feed**: Real-time updates for user activities.
- **Post Analytics**: Insights on post reach and engagement.

--

Happy coding and welcome to Connectly! 🎉

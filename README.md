# 🏃 SpringBootAPI — In-Memory CRUD API with Unit Tests

Welcome to the **SpringBootAPI**! This branch demonstrates a simple yet powerful CRUD API for managing "Run" data structures entirely in memory, focusing on robust unit testing practices using the Spring Boot ecosystem.

## 🚀 What’s Inside?

- **In-Memory CRUD Operations**  
  Effortlessly create, read, update, and delete "Run" objects with no external database required. Great for quick prototyping and learning.

- **Unit Testing Best Practices**  
  Comprehensive unit tests crafted with `spring-boot-starter-test` and JUnit, ensuring API correctness and reliability.

- **Spring Boot Fundamentals**  
  Clean codebase structured for clarity and maintainability, leveraging Spring Boot’s auto-configuration and annotations.

## 🧪 Testing Approach

- **MockMVC for API Testing**  
  Simulate HTTP requests and verify responses without starting a full web server.

- **Isolated Service Layer Tests**  
  Ensure business logic works independently of the controller and persistence layers.

- **Exception Handling & Edge Cases**  
  Tests cover not just the happy path, but also error scenarios like missing data or invalid input.

## 📁 Project Structure

```plaintext
src/
├── main/
│   └── java/
│       └── ... RunController, RunService, Run model
├── test/
│   └── java/
│       └── ... RunControllerTest, RunServiceTest
```

## 🛠️ How to Run Tests

1. Clone this branch:
    ```bash
    git clone -b <branch-name> https://github.com/oleksy-piotr-angular/SpringBootAPI.git
    ```
2. Run tests using Maven:
    ```bash
    mvn test
    ```
   Or with Gradle:
    ```bash
    ./gradlew test
    ```

## 🌳 Why In-Memory?

- Fast setup—no external dependencies!
- Perfect for learning Spring Boot CRUD and unit testing.
- Easily extendable for integration with real databases in other branches.

## 🔗 Related Branches

- **master:** Connects "Run" data structure to an HTTP REST client and supports persistent storage.

---

Happy coding!  
Feel free to fork, explore, and contribute.  
For questions or suggestions, open an issue or PR!

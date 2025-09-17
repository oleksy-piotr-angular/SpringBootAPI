# SpringBootAPI

Welcome to **SpringBootAPI** – a robust, production-ready RESTful service built with Spring Boot and PostgreSQL.

branches:<br>
-master<br>
-testing

## 🚀 Overview

This project demonstrates a complete CRUD API for managing `Run` entities. Designed for easy local development and real-world integration, it showcases best practices for connectivity, containerization, and code quality.

---

## 🛠 Features

- **CRUD Operations**: Create, Read, Update, and Delete `Run` data.
- **PostgreSQL Database**: Seamless data persistence using PostgreSQL.
- **Docker Compose**: Effortless local setup via `docker-compose.yml`.
- **External REST Client**: Integrates with [jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com/) to demonstrate outbound HTTP requests.
- **Unit Testing**: Includes unit tests (see the `testing` branch) powered by Spring's testing stack.

---

## ⚡ Getting Started

### Prerequisites

- [Java 17+](https://adoptopenjdk.net/)
- [Docker & Docker Compose](https://docs.docker.com/get-docker/)
- [Maven](https://maven.apache.org/)

### Local Development

1. **Clone the Repository**
   ```bash
   git clone https://github.com/oleksy-piotr-angular/SpringBootAPI.git
   cd SpringBootAPI
   ```

2. **Start PostgreSQL via Docker**
   ```bash
   docker-compose up -d
   ```

3. **Configure Database Connection**

   By default, database settings are pre-configured for local Docker. You may adjust them in `src/main/resources/application.properties` if needed.

4. **Run the Application**
   ```bash
   ./mvnw spring-boot:run
   ```
   or
   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**

   The service runs on [http://localhost:8080](http://localhost:8080). Explore the endpoints using [Postman](https://www.postman.com/) or [curl](https://curl.se/).

---

## 📋 Example Endpoints

- `GET /runs` — List all runs
- `POST /runs` — Create a new run
- `PUT /runs/{id}` — Update a run
- `DELETE /runs/{id}` — Delete a run
- `GET /external/posts` — Fetch posts from jsonplaceholder (example of REST client integration)

---

## 🧪 Testing

Unit tests are available in the `testing` branch, leveraging Spring Boot's built-in testing tools:

```bash
git checkout testing
mvn test
```

---

## 📦 Docker Compose

The repository contains a `docker-compose.yml` for easy PostgreSQL setup. This streamlines development, eliminating manual DB configuration.

---

## 🤝 Contributing

Pull requests and suggestions are welcome! For major changes, please open an issue first to discuss what you’d like to modify.

---

## 📚 Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)
- [Docker Compose](https://docs.docker.com/compose/)
- [jsonplaceholder](https://jsonplaceholder.typicode.com/)

---

## 📄 License

This project is licensed under the MIT License.

---

**Happy Coding!**

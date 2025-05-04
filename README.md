# Spring Boot REST API Example

A simple RESTful API example built with Spring Boot that demonstrates basic CRUD operations and REST principles.

## Project Overview

This project showcases a simple implementation of a RESTful API using Spring Boot. It includes:

- Basic Controller structure
- Service layer
- Domain models
- Integration with Lombok for boilerplate code reduction

## Technology Stack

- Java 21
- Spring Boot 3.4.5
- Maven 3.9.9
- Spring Web
- Spring DevTools
- Lombok
- JUnit 5 for testing

## Project Structure

```
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── nvg
│   │   │           └── apirest
│   │   │               ├── ApiRestApplication.java
│   │   │               ├── controller
│   │   │               │   └── Controller.java
│   │   │               ├── domain
│   │   │               │   └── User.java
│   │   │               └── service
│   │   │                   └── Service.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── nvg
│                   └── apirest
│                       └── ApiRestApplicationTests.java
├── .gitattributes
├── .gitignore
├── .mvn
│   └── wrapper
│       └── maven-wrapper.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## API Endpoints

The API currently supports the following endpoints:

- `GET /rest-api/get`: Returns a greeting message
- `POST /rest-api/{id}`: Accepts a user object and returns information about the filter parameter

## Setup and Running

### Prerequisites

- Java 21 JDK
- Maven (or use the included Maven wrapper)

### Steps to run locally

1. Clone this repository
   ```
   git clone <repository-url>
   cd spring-boot-rest-api
   ```

2. Build the project
   ```
   ./mvnw clean install
   ```

3. Run the application
   ```
   ./mvnw spring-boot:run
   ```

4. The API will be available at:
   ```
   http://localhost:8080/rest-api/
   ```

## API Usage Examples

### Get Hello Message

```bash
curl -X GET http://localhost:8080/rest-api/get
```

### Post User Data

```bash
curl -X POST \
  http://localhost:8080/rest-api/123 \
  -H 'Content-Type: application/json' \
  -d '{
    "username": "testuser",
    "password": "testpassword"
}'
```

### Post User Data with Filter Parameter

```bash
curl -X POST \
  http://localhost:8080/rest-api/123?filter=active \
  -H 'Content-Type: application/json' \
  -d '{
    "username": "testuser",
    "password": "testpassword"
}'
```

## Development

### Adding a new endpoint

1. Define the endpoint in the `Controller.java` file
2. Implement the required business logic in the `Service.java` file
3. Create new domain models as needed

### Testing

Run the tests using:

```bash
./mvnw test
```

## Author

- nvg :)

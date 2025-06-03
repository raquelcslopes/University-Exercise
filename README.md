# UniExercise

This project is a Spring Boot application for managing a university, including entities such as Student, Teacher, Course, and Subject.

## Features
- Register, list, update, and remove students and teachers
- Management of courses and subjects
- Custom exceptions for business rules
- Basic security with HTTP authentication
- Automatic documentation via Swagger
- Data persistence with MySQL
- Detailed logging

## Requirements
- Java 17+
- Maven
- MySQL

## Setup
1. Clone the repository:
   ```bash
   git clone <repo-url>
   ```
2. Configure the database in `src/main/resources/application.properties`:
   - MySQL user, password, and URL
3. Run automatic migrations (Spring JPA)

## Running the Project
```bash
./mvnw spring-boot:run
```

Access the Swagger documentation at: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Project Structure
- `controller/` - REST Controllers
- `entity/` - JPA Entities
- `repository/` - Spring Data Repositories
- `service/` - Business logic
- `exceptions/` - Custom exceptions
- `model/` - DTOs
- `securityConfig/` - Security configuration

## Authentication
Default username and password defined in `application.properties`:
- Username: `admin`
- Password: `admin123`

## License
Project for educational purposes.


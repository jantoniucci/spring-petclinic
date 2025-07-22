# AI Coding Agent Instructions for Spring PetClinic

## Project Overview
Spring PetClinic is a sample application demonstrating the use of Spring Boot, Thymeleaf, and other Spring technologies. It is structured as a monolithic application with a focus on simplicity and clarity for learning purposes.

### Key Components
- **Main Application**: The entry point is `PetClinicApplication` located in `src/main/java/org/springframework/samples/petclinic`.
- **Database**: By default, it uses an in-memory H2 database. Profiles for MySQL and PostgreSQL are also available.
- **Frontend**: Uses Thymeleaf templates located in `src/main/resources/templates`.
- **Backend**: Services and repositories are implemented in the `org.springframework.samples.petclinic` package.

### Data Flow
1. **Frontend**: Thymeleaf templates render the UI.
2. **Controller Layer**: Handles HTTP requests and maps them to services.
3. **Service Layer**: Contains business logic.
4. **Repository Layer**: Interacts with the database using Spring Data JPA.

## Developer Workflows

### Creating an Issue
Tu tarea es generar una issue en github con un plan de implementación para una nueva funcionalidad, correcciones o para refactorizar código existente.

No realices ninguna modificación en el código, solo genera un plan.

El plan consiste en un documento Markdown que describe el plan de implementación, e incluye las siguientes secciones:

* Visión general: Una breve descripción de la funcionalidad o tarea de refactorización.

* Requisitos: Una lista de requisitos para la funcionalidad o tarea de refactorización.

* Pasos de implementación: Una lista detallada de pasos para implementar la funcionalidad o tarea de refactorización.

* Pruebas: Una lista de pruebas que deben implementarse para verificar la funcionalidad o tarea de refactorización.

Una vez que el plan esté completo, pregunta al usuario si desea crear una issue en GitHub para este plan de implementación. Si responde afirmativamente, procede a crear la issue utilizando la herramienta `create_issue`.


### Building the Project
- **Maven**:
  ```bash
  ./mvnw package
  ```
  The JAR file will be located in `target/`.

- **Gradle**:
  ```bash
  ./gradlew build
  ```
  The JAR file will be located in `build/libs/`.

### Running the Application
- **Default (H2 Database)**:
  ```bash
  java -jar target/*.jar
  ```
- **With MySQL Profile**:
  ```bash
  java -Dspring.profiles.active=mysql -jar target/*.jar
  ```
- **With PostgreSQL Profile**:
  ```bash
  java -Dspring.profiles.active=postgres -jar target/*.jar
  ```

### Running Tests
- Integration tests are located in `src/test/java/org/springframework/samples/petclinic`.
- Use Maven to run tests:
  ```bash
  ./mvnw test
  ```

### Debugging
- Use the `PetClinicIntegrationTests` class for fast feedback during development.
- MySQL and PostgreSQL integration tests use Docker containers (Testcontainers or Docker Compose).

## Project-Specific Conventions
- **CSS Compilation**: SCSS files in `src/main/resources/static/scss` are compiled to CSS using the Maven `css` profile:
  ```bash
  ./mvnw package -P css
  ```
- **Profiles**: Use `spring.profiles.active` to switch between database configurations.
- **EditorConfig**: Follow the `.editorconfig` file for consistent code formatting.

## Integration Points
- **External Databases**: MySQL and PostgreSQL configurations are provided. Use `docker-compose.yml` to start database containers.
- **Spring Boot Plugins**: The project uses Spring Boot Maven and Gradle plugins for building and running the application.
- **Testcontainers**: Used for MySQL integration tests.

## Key Files and Directories
- `src/main/java/org/springframework/samples/petclinic`: Main application code.
- `src/main/resources/templates`: Thymeleaf templates.
- `src/main/resources/static`: Static assets (CSS, JS).
- `src/test/java/org/springframework/samples/petclinic`: Test cases.
- `docker-compose.yml`: Docker Compose configuration for databases.

## Notes for AI Agents
- Focus on maintaining the simplicity and clarity of the codebase.
- Follow the existing patterns for controllers, services, and repositories.
- Ensure any new features or fixes are covered by tests in the `src/test` directory.
- Use the provided Maven and Gradle wrappers for consistent builds.

For more details, refer to the [README.md](../README.md).

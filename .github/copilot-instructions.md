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

### Creación de una Issue

Estás en modo agente. Tu objetivo es elaborar un plan de implementación claro y detallado para una nueva funcionalidad, corrección o tarea de refactorización, listo para ser convertido en una issue de GitHub.

Sigue estos pasos:

1. **Genera un documento Markdown** en castellano estructurado así:

   * **Visión General:** Descripción concisa y clara del objetivo de la funcionalidad o tarea.

   * **Requisitos:** Lista precisa y completa de requisitos necesarios.

   * **Pasos de Implementación:** Detalla los pasos específicos que se deben seguir para la implementación, incluyendo la ruta relativa de los ficheros involucrados.

   * **Pruebas:** Lista las pruebas necesarias para validar el resultado correctamente.

2. Al finalizar el documento Markdown, consulta explícitamente al usuario si desea crear una issue en GitHub con este plan.

3. Si el usuario confirma, crea automáticamente la issue utilizando la herramienta `create_issue`.


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

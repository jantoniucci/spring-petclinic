# Instrucciones para Agente de Codificación IA - Spring PetClinic

## Descripción del Proyecto

Spring PetClinic es una aplicación de ejemplo que demuestra el uso de Spring Boot, Thymeleaf y otras tecnologías de Spring. Está estructurada como una aplicación monolítica, con un enfoque en la simplicidad y claridad para fines de aprendizaje.

### Componentes Clave

* **Aplicación Principal**: El punto de entrada es `PetClinicApplication`, ubicado en `src/main/java/org/springframework/samples/petclinic`.
* **Base de Datos**: Por defecto, utiliza una base de datos en memoria H2. También hay perfiles disponibles para MySQL y PostgreSQL.
* **Frontend**: Utiliza plantillas Thymeleaf ubicadas en `src/main/resources/templates`.
* **Backend**: Los servicios y repositorios se implementan en el paquete `org.springframework.samples.petclinic`.

### Flujo de Datos

1. **Frontend**: Las plantillas Thymeleaf generan la interfaz de usuario.
2. **Capa de Controlador**: Maneja las solicitudes HTTP y las asigna a los servicios.
3. **Capa de Servicio**: Contiene la lógica de negocio.
4. **Capa de Repositorio**: Interactúa con la base de datos usando Spring Data JPA.

## Flujos de Trabajo para Desarrolladores

### Creación de una Issue

Estás en modo agente. Tu objetivo es elaborar un plan de implementación claro y detallado para una nueva funcionalidad, corrección o tarea de refactorización, listo para ser convertido en una issue de GitHub.

Sigue estos pasos:

1. **Genera un documento Markdown** en castellano estructurado de la siguiente manera:

   * **Visión General:** Descripción concisa y clara del objetivo de la funcionalidad o tarea.

   * **Requisitos:** Lista precisa y completa de requisitos necesarios.

   * **Pasos de Implementación:** Detalla los pasos específicos que se deben seguir para la implementación, incluyendo la ruta relativa de los ficheros involucrados.

   * **Pruebas:** Lista las pruebas necesarias para validar correctamente el resultado.

2. Al finalizar el documento Markdown, consulta explícitamente al usuario si desea crear una issue en GitHub con este plan.

3. Si el usuario confirma, crea automáticamente la issue utilizando la herramienta `create_issue`.

### Resolución de una Issue

Estás en modo agente. Tu objetivo es guiar al desarrollador en la resolución de una issue existente, asegurando trazabilidad, buenas prácticas y un flujo correcto desde la identificación hasta la creación de la pull request.

Sigue estos pasos:

1. **Solicitar Identificador de Issue:**

   * Si el usuario no ha indicado el identificador de la issue (`issue_id`), solicítalo antes de continuar.

2. **Consultar la Issue:**

   * Utiliza la herramienta `get_issue` con el `issue_id` proporcionado para recuperar el contenido completo de la issue (título, descripción, etiquetas, etc.).

3. **Crear una Nueva Rama Git:**

   * A partir de los datos recuperados, crea una nueva rama con la herramienta `create_branch`.
   * La rama debe nombrarse siguiendo este formato:
     `ISSUE-<código>` + `-` + `<primeras-5-palabras-del-título-en-kebab-case>`
   * Ejemplo: `ISSUE-1234-crear-api-consulta-cliente`.

4. **Cambiar a la Nueva Rama Localmente:**

   * Realiza un `checkout` a la rama recién creada en el repositorio local para comenzar el trabajo.

5. **Resolver la Issue:**

   * Modifica los archivos necesarios de acuerdo con los requisitos de la issue.
   * Asegúrate de mantener una trazabilidad clara y coherente con lo planteado en la descripción de la issue.

6. **Revisión y Verificación:**

   * Solicita al desarrollador que revise los cambios aplicados.
   * Pídele que ejecute los tests relevantes para asegurarse de que la solución no introduce regresiones y cumple los criterios definidos.

7. **Explicación de los Pasos Finales:**

   * Una vez confirmada la validez de los cambios:

     * Realiza un `commit` con un mensaje estructurado y vinculado al `issue_id`.
     * Crea una `pull request` (PR) hacia la rama principal del repositorio (habitualmente `main` o `develop`).
   * Informa al desarrollador que puedes asistir en la creación de la PR si lo desea.


### Contribución de código (Git Commit)

Estás en modo agente. Tu objetivo es asistir al desarrollador para realizar un commit de manera controlada, siguiendo buenas prácticas de calidad y formato.

Sigue estos pasos:

1. **Mostrar los ficheros detectados:**

   * Enumera los archivos modificados, añadidos y eliminados en el repositorio local.
   * Indica cuáles serán incluidos en el commit y cuáles no lo están.
   * Pregunta al usuario si desea continuar con esos archivos o añadir/eliminar alguno antes de proceder.

2. **Gestión del mensaje de commit:**

   * Si el usuario *no ha indicado un mensaje de commit*, solicita uno y sugiere automáticamente una descripción inicial basada en los cambios detectados, utilizando el formato de [Conventional Commits](https://www.conventionalcommits.org/es/v1.0.0/):

     ```
     tipo(scope): descripción
     ```

     Ejemplo: `feat(auth): añadir validación de token JWT`
   * Si el usuario *sí ha indicado un mensaje de commit*, valida que cumpla con el formato de conventional commit.

     * Si **cumple**, continúa.
     * Si **no cumple**, sugiere una versión corregida y ofrece al usuario:

       * Confirmar el uso del mensaje corregido.
       * Utilizar forzadamente el mensaje original.
       * Introducir un nuevo mensaje.

3. **Ejecución de pruebas:**

   * Ejecuta todos los tests definidos en el proyecto (por ejemplo, mediante `npm test`, `pytest`, `mvn test`, etc.).
   * Si alguna prueba falla, muestra un resumen de errores.
   * Pregunta al usuario si desea continuar con el commit a pesar de los errores o detenerse para corregirlos antes.

4. **Realización del commit:**

   * Ejecuta el comando `git commit` con los archivos y mensaje validados.
   * Muestra el resultado del commit y su hash.

5. **Pasos siguientes:**

   * Informa al usuario que puede:

     * Continuar trabajando en nuevas tareas.
     * Crear una *pull request* para compartir su contribución.
   * Pregunta si desea asistencia para crear la pull request. En caso afirmativo, puedes ayudarle a:

     * Establecer el título y descripción de la PR.
     * Seleccionar la rama de destino.
     * Agregar revisores y etiquetas.

### Creación de una Pull Request

Estás en modo agente. Tu objetivo es asistir al desarrollador en la generación de una *pull request* conforme a buenas prácticas y al formato de *conventional commits*. Sigue los pasos detallados a continuación:

1. **Verifica si existen archivos pendientes de commit.**

   * Si hay ficheros sin commitear, muéstralos en una lista y consulta explícitamente al usuario si desea continuar sin incluirlos.
   * Ejemplo:

     ```
     Los siguientes archivos no han sido commiteados:
     - src/servicio/Calculadora.java
     - tests/servicio/CalculadoraTest.java

     ¿Deseas continuar sin incluir estos cambios? (sí/no)
     ```

2. **Comprobar si se ha indicado una descripción para la pull request.**

   * Si **no se ha proporcionado** descripción:

     * Solicita una.
     * Propón una basada en los commits actuales y ajustada al formato *conventional commit*.
     * Ejemplo:

       ```
       No se ha indicado una descripción. Sugiero la siguiente:
       feat(servicio): añadir soporte para multiplicación de matrices
       ¿Quieres utilizar esta o escribir una nueva?
       ```
   * Si **se ha proporcionado una descripción**:

     * Verifica que siga el formato *conventional commit* (por ejemplo: `feat(módulo): descripción breve`).
     * Si **no cumple con el formato**, propón una alternativa basada en los cambios detectados o consulta si desea usar la original forzadamente.
     * Ejemplo:

       ```
       La descripción proporcionada no sigue el formato conventional commit. Sugiero:
       fix(api): corregir manejo de errores en respuesta HTTP 500
       ¿Deseas utilizar esta descripción sugerida o mantener la actual?
       ```

3. **Crear la pull request utilizando la herramienta `create_pull_request`.**

   * Incluir en el body de la PR, una linea al final que indique "Resolve: #N" donde N es el identificador de la issue actual
   * Una vez validada o definida la descripción, procede a ejecutar la creación de la pull request con el contenido aprobado.

4. **Informa sobre los pasos siguientes.**

   * Una vez creada la pull request, un revisor será asignado para:

     * Revisar el código,
     * Solicitar cambios si es necesario,
     * O aprobarlo, en cuyo caso se procederá al *merge*.
   * Si la pull request está asociada a una issue, esta será cerrada automáticamente una vez aprobada y fusionada.


### Compilación del Proyecto


  ```bash
  ./mvnw package
  ```

  El archivo JAR estará en `target/`.


### Ejecución de la Aplicación

* **Por Defecto (Base de Datos H2)**:

  ```bash
  java -jar target/*.jar
  ```
* **Con Perfil MySQL**:

  ```bash
  java -Dspring.profiles.active=mysql -jar target/*.jar
  ```
* **Con Perfil PostgreSQL**:

  ```bash
  java -Dspring.profiles.active=postgres -jar target/*.jar
  ```

### Ejecución de Pruebas

* Las pruebas de integración se encuentran en `src/test/java/org/springframework/samples/petclinic`.
* Usa Maven para ejecutar las pruebas:

  ```bash
  ./mvnw test
  ```

### Depuración

* Usa la clase `PetClinicIntegrationTests` para obtener retroalimentación rápida durante el desarrollo.
* Las pruebas de integración con MySQL y PostgreSQL utilizan contenedores Docker (Testcontainers o Docker Compose).

## Convenciones Específicas del Proyecto

* **Compilación de CSS**: Los archivos SCSS en `src/main/resources/static/scss` se compilan a CSS usando el perfil `css` de Maven:

  ```bash
  ./mvnw package -P css
  ```
* **Perfiles**: Usa `spring.profiles.active` para cambiar entre configuraciones de base de datos.
* **EditorConfig**: Sigue el archivo `.editorconfig` para mantener un formato de código consistente.

## Puntos de Integración

* **Bases de Datos Externas**: Se proporcionan configuraciones para MySQL y PostgreSQL. Usa `docker-compose.yml` para iniciar los contenedores de bases de datos.
* **Plugins de Spring Boot**: El proyecto utiliza los plugins de Maven de Spring Boot para construir y ejecutar la aplicación.
* **Testcontainers**: Utilizados para pruebas de integración con MySQL.

## Archivos y Directorios Clave

* `src/main/java/org/springframework/samples/petclinic`: Código principal de la aplicación.
* `src/main/resources/templates`: Plantillas Thymeleaf.
* `src/main/resources/static`: Recursos estáticos (CSS, JS).
* `src/test/java/org/springframework/samples/petclinic`: Casos de prueba.
* `docker-compose.yml`: Configuración de Docker Compose para bases de datos.

## Notas para Agentes de IA

* Mantén la simplicidad y claridad del código base.
* Sigue los patrones existentes para controladores, servicios y repositorios.
* Asegúrate de que cualquier nueva funcionalidad o corrección esté cubierta por pruebas en el directorio `src/test`.
* Usa los wrappers de Maven proporcionados para construir de forma consistente.

Para más detalles, consulta el archivo [README.md](../README.md).

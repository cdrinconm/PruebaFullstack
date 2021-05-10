******************************************** CRUD ********************************************
Config
Esta carpeta contiene la configuracion de la herramienta Swagger, la cual es una interfaz grafica con
el resumen de todos los endpoints y descripcion de los CRUD de cada uno de los controladores.
http://localhost:8080/swagger-ui.html

En el repositorio tambien se encuentra la coleccion en Postman.

******************************************** Carpetas ********************************************

Demo
Contiene la clase java principal en donde se corre la aplicacion.

Controllers
Recibe todas las peticiones que se hacen desde el navegador y se configura todos los endpoints.

Services
Es toda la logica del programa.

Repositories
Todas las consultas o queries a la base de datos.

Models
Representacion de las tablas de la base en datos en clases.

Other Sources -> src/main/resources -> application.properties.

Se ecnuentra toda la configuracion a la base de datos en PostgreSQL.

******************************************** INSTRUCCIONES ********************************************

Instrucciones para correr el BackEnd:

1- Instalar PostgreSQL 9.5 - pgAdmin III, configurar la contraseña "Admin" y el puerto 5432. 
    Instalar Maven. Instalar JDK y Java. (Instaladores en el repositorio).
2- Crear una base de datos llamada "basePrueba".
3- Correr el query "TablaLocation" (En el repositorio) o cargar backup "basePrueba.backup".
4- Localizar y entrar en la carpeta "BackEnd".
    - Click derecho, abrir Git Bash Here.
    - Correr comando "mvn clean install", "cd target/" y "java -jar BackendPrueba-0.0.1.jar" para correr el servidor.
5- Relizar las pruebas en Postman o en el navegador(http://localhost:8080/location).
    - Para ver el CRUD se pede usar la interfaz de Swagger http://localhost:8080/swagger-ui.html.

******************************************** DOCKER ********************************************

1- Ir a la carpeta de Docker.
2- Correr el comando por terminal "docker-compose up -d" para levantar la imagen.

******************************************** ANGULAR ********************************************

1- Entra en la carpeta "FrontEnd".
2- Correr comando por terminal "ng serve --open" para correr el servicio (http://localhost:4200/).

# Getting Started

## Pra rodar, abrir terminal na pasta e digitar:

- ./mvnw clean package
- docker-compose up --build

OBS: Se der erro de permission no primeiro comando, rode chmod 777 ./mvnw e tente novamente.

## Rotas (GET)

- http://localhost:8080/cursos/
- http://localhost:8080/cursos/{id}
- http://localhost:8080/cursos/por-area

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.10/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.10/maven-plugin/reference/html/#build-image)


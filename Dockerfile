FROM adoptopenjdk/openjdk11
COPY target/cursos-0.0.1-SNAPSHOT.jar cursos-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dfile.encoding=UTF-8","-jar","/cursos-0.0.1-SNAPSHOT.jar"]

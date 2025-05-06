FROM openjdk:21
WORKDIR /app
COPY target/student-service-0.0.1-SNAPSHOT.jar student-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","student-service.jar"]
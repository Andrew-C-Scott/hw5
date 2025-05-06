FROM openjdk:21
WORKDIR /app
COPY target/instructor-service-0.0.1-SNAPSHOT.jar instructor-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","instructor-service.jar"]
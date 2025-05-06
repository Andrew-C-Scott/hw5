FROM openjdk:21
WORKDIR /app
COPY target/course-service-0.0.1-SNAPSHOT.jar course-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","course-service.jar"]
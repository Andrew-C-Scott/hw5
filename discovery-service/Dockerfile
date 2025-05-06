FROM openjdk:21
WORKDIR /app
COPY target/discovery-service-0.0.1-SNAPSHOT.jar discovery-service.jar
EXPOSE 8070
ENTRYPOINT ["java","-jar","discovery-service.jar"]
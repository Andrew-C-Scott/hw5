FROM openjdk:21
WORKDIR /app
COPY target/gatewayserver-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8072
ENTRYPOINT ["java","-jar","app.jar"]
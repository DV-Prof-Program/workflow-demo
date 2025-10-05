FROM openjdk:23-jdk-slim
COPY target/workflow-demo-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

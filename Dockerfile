FROM openjdk:23-jdk-slim
COPY target/workflow-demo-1.0-SNAPSHOT.jar App.jar
ENTRYPOINT ["java", "-jar", "App.jar"]

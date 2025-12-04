FROM eclipse-temurin:21-jdk
COPY target/workflow-demo-1.0-SNAPSHOT.jar App.jar
ENTRYPOINT ["java", "-jar", "App.jar"]

FROM openjdk:17-jdk-slim
COPY target/deployDeploy-0.0.1.jar deployDeploy.jar
ENTRYPOINT ["java", "-jar", "/deployDeploy.jar"]

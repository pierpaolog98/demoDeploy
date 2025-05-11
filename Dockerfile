FROM openjdk:17-jdk-slim
COPY target/demoDeploy-0.0.1.jar demo-deploy.jar
ENTRYPOINT ["java", "-jar", "/demo-deploy.jar"]

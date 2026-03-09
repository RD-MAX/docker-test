FROM eclipse-temurin:17-jdk-alpine
LABEL maintainer="riya dhiman"
WORKDIR /app
COPY target/demo-docker.jar app.jar
EXPOSE 7004
ENTRYPOINT ["java","-jar","app.jar"]
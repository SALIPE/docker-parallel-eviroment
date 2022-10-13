FROM openjdk:11
WORKDIR /app

COPY target/docker-first-app-spring.jar /app/docker-first-app.jar

ENTRYPOINT ["java","-jar","docker-first-app.jar"]
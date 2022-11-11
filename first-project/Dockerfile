FROM openjdk:8-jdk-alpine 
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src
RUN ["./mvnw", "test"]



FROM openjdk:11 as base
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

FROM base as test
RUN ["./mvnw", "test"]

FROM base as development
CMD ["./mvnw", "spring-boot:run"]

FROM base as build
RUN ./mvnw package

FROM  openjdk:11 as production
EXPOSE 8080
COPY --from=build /app/target/docker-first-app-spring.jar /docker-first-app.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/docker-first-app.jar"]


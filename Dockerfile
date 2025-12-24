# Etapa de build
FROM maven:3.9.9-amazoncorretto-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa final
FROM amazoncorretto:21.0.9
WORKDIR /app
COPY --from=build /app/target/ms-comunicacao-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
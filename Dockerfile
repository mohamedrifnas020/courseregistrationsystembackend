# FROM eclipse-temurin:17-jre
#
# WORKDIR /app
#
# COPY target/course-registration-system-0.0.1-SNAPSHOT.jar app.jar
#
# EXPOSE 8080
#
# ENTRYPOINT ["java","-jar","app.jar"]


# ===== Build Stage =====
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copy full project
COPY . .

# Build Spring Boot jar
RUN mvn clean package -DskipTests

# ===== Runtime Stage =====
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy jar from build stage (no need for local target/)
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
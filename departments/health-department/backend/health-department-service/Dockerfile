# Use an official Java runtime as a parent image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/health-department-service-0.0.1-SNAPSHOT.jar /app/health-department-service.jar

# Expose the port the app runs on
EXPOSE 8083

# Run the JAR file
CMD ["java", "-jar", "/app/health-department-service.jar"]

# Keep the container running
CMD ["tail", "-f", "/dev/null"]

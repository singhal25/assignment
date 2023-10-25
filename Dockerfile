# Fetching latest version of Java
FROM openjdk:11

# Setting up work directory

WORKDIR /app


# Copy the jar file into our app

COPY ./target/furniture-0.0.1-SNAPSHOT.jar /app


# Exposing port 8080
EXPOSE 8081


# Starting the application

CMD ["java", "-jar", "furniture-0.0.1-SNAPSHOT.jar"]
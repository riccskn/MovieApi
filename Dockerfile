FROM openjdk:8-jdk-alpine
WORKDIR "/home"
COPY target/movie-0.0.1-SNAPSHOT.jar .
EXPOSE 8095
CMD ["java", "-jar", "movie-0.0.1-SNAPSHOT.jar"]
FROM openjdk:17-jdk-alpine
COPY target/vivlibre.api-0.0.1-SNAPSHOT.jar vivelibre-token.jar
ENTRYPOINT ["java", "-jar", "vivelibre-token.jar"]
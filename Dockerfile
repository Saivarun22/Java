From openjdk:17-slim

Entrypoint ["java", "-jar", "/app.jar"]

COPY target/*.jar /app.jar

EXPOSE 8080

volume /tmp

network host 
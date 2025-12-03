FROM eclipse-temurin:22-jdk

WORKDIR /app
COPY target/einvoice.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

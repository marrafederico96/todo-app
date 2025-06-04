# 1. Usa Java 21 come base dell'immagine
FROM eclipse-temurin:21-jdk-alpine

# 2. Imposta la directory di lavoro dentro il container
WORKDIR /app

# 3. Copia il file JAR generato nella directory /app
COPY target/*.jar app.jar

# 4. Espone la porta 8080 (usata da Spring Boot)
EXPOSE 8080

# 5. Comando per avviare l'applicazione
ENTRYPOINT ["java", "-jar", "app.jar"]

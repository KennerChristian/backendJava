# Etapa de build
FROM maven:3.8.6-openjdk-21-slim AS build

# Atualiza o repositório e instala o OpenJDK 21
RUN apt-get update && apt-get install openjdk-21-jdk -y

# Copia o código-fonte do projeto
COPY . /app

# Define o diretório de trabalho
WORKDIR /app

# Executa o Maven para construir o projeto
RUN mvn clean install

# Etapa de execução
FROM openjdk:21-jdk-slim

# Expõe a porta 8080 para a aplicação
EXPOSE 8080

# Copia o JAR gerado na etapa de build
COPY --from=build /app/target/ems-backend-0.0.1-SNAPSHOT.jar /app.jar

# Executa a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]

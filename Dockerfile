# syntax=docker/dockerfile:1
# Which "official Java image"? (ke thua tu cai image nao tren docker hub)
FROM openjdk:oraclelinux8
# Working directory(thu muc lam viec)
WORKDIR /app
# Copy form your Host (PC, laptop) to container(copy tu pc,lap sang container DOCKER)
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
# Run this inside the image(chay trong image de download dependence vaof trong image)
RUN ./mvnw dependency:go-offline
# Copy from src host to container
COPY src ./src
# Run inside container (chay source tren container)
CMD ["./mvnw","spring-boot:run"]
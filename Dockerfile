FROM openjdk:17-oracle
WORKDIR /app
COPY target/Calculator_MT2023195-1.0-SNAPSHOT.jar caculator.jar

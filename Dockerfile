FROM eclipse-temurin:17
WORKDIR /usr/src/app
COPY /target/primesservice-0.0.1-SNAPSHOT.jar primesservice.jar

ENTRYPOINT ["java", "-jar", "primesservice.jar"]
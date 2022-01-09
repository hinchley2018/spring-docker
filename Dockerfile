FROM openjdk:17-jre-slim

WORKDIR /app
COPY ./target/spring-app-0.1/SNAPSHOT.jar /app

EXPOSE 8080

CMD [ "java", "-jar", "spring-app-0.1/SNAPSHOT.jar" ]
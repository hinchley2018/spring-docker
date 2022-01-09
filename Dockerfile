FROM maven:3.8.3 AS maven

WORKDIR /app
COPY . /app
RUN mvn package

FROM openjdk:17-slim
ARG JAR_File=jhinchley-springapi.jar

WORKDIR /opt/app 
COPY --from=maven /app/target/${JAR_File} /opt/app

ENTRYPOINT [ "java", "-jar", "jhinchley-springapi.jar" ]
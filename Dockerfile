FROM maven:3.8.3 AS maven

WORKDIR /app
COPY . /app
#need to optimize this takes > 30sec locally spends lots of time restoring pkgs
RUN mvn package

FROM openjdk:17-slim
ARG JAR_File=jhinchley-springapi.jar

WORKDIR /opt/app 
COPY --from=maven /app/target/${JAR_File} /opt/app

ENTRYPOINT [ "java", "-jar", "jhinchley-springapi.jar" ]
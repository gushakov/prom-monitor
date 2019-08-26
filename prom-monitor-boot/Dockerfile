FROM openjdk:8-jdk-alpine
RUN apk --no-cache add curl
VOLUME /tmp
ARG JAR_FILE=target/prom-monitor-boot-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

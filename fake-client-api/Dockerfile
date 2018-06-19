FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/fake-client-api-1.0-SNAPSHOT-exec.jar app.jar
EXPOSE 8080
RUN sh -c 'touch /app.jar'
CMD java -jar app.jar
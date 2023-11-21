FROM openjdk:8-jre-alpine
#RUN mkdir /app
WORKDIR /app
COPY target/apigateway-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8765
CMD ["java", "-jar", "app.jar"]
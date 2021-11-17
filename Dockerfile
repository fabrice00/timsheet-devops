FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/TimeSheet-1.0.jar TimeSheet-1.0.jar
ENTRYPOINT ["java","-jar","/TimeSheet-1.0.jar"]
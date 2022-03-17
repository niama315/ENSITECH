FROM openjdk:11
MAINTAINER niama


COPY ./target/*.jar ENSITECH.jar
ENTRYPOINT ["java","-jar","/ENSITECH.jar"]
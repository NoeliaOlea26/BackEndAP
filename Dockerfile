FROM amazoncorretto:19-alpine-jdk
MAINTAINER noe
COPY target/backportfolio-0.0.1-SNAPSHOT noeback.jar
ENTRYPOINT ["java","-jar","/noeback.jar"]

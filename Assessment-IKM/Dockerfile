FROM openjdk:11-jre-slim

EXPOSE 8080

ADD target/fundingBody.jar fundingBody.jar

ENTRYPOINT ["java","-jar","/fundingBody.jar"]
FROM  eclipse temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/SpringPieplineCode-0.0.1-SNAPSHOT.jar SpringPieplineCode-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringPieplineCode-0.0.1-SNAPSHOT.jar"]
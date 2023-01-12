FROM openjdk:11
EXPOSE 8080
ADD target/docker-2-0.0.1-SNAPSHOT2.jar docker-2.jar
ENTRYPOINT [ "java","-jar","/docker-2.jar"]
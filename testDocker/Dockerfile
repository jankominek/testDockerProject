FROM openjdk:11
ADD target/testDocker.jar testDocker.jar
EXPOSE 8079
ENTRYPOINT [ "java", "-jar", "testDocker.jar" ]
FROM openjdk:11
ADD target/testdocker.jar testdocker.jar
EXPOSE 8079
ENTRYPOINT [ "java", "-jar", "testdocker.jar" ]

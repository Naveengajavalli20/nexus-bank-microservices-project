# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-ea-1-bullseye

# Who maintains the image
MAINTAINER naveen

# Add the application's jar to the container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]
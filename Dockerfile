FROM openjdk:17

COPY target/DockerizeSpringBoot-0.0.1-SNAPSHOT.jar DockerizeSpringBoot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/DockerizeSpringBoot-0.0.1-SNAPSHOT.jar"]



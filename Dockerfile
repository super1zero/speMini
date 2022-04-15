FROM openjdk:11
COPY ./target/speMini-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "speMini-1.0-SNAPSHOT-jar-with-dependencies.jar"]
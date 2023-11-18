FROM openjdk:8
ADD ./target/spring-boot-data-jpa-0.0.1-SNAPSHOT.jar spring-boot-data-jpa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-data-jpa-0.0.1-SNAPSHOT.jar"]
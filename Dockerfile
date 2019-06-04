FROM java:8
ADD target/Parte_2-1.0-SNAPSHOT.jar Parte_2.jar
ENTRYPOINT ["java","-jar","Parte_2.jar"]
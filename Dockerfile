FROM openjdk:22-jdk
ADD target/einvoice.jar einvoice.jar
ENTRYPOINT ["java","-jar","/einvoice.jar"]
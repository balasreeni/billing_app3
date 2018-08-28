FROM java:8-jre

USER root

ADD ./target/billing_app4-0.1-SNAPSHOT.jar /opt/billing_app4-0.1-SNAPSHOT.jar
CMD ["java", "-Xmx200m", "-jar", "/opt/billing_app4-0.1-SNAPSHOT.jar"]

EXPOSE 8080


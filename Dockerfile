FROM openjdk:17-jdk-alpine
WORKDIR /opt
ENV PORT 8082
EXPOSE 8083
COPY target/*.jar /opt/Kubernatedemo.jar
ENTRYPOINT exec java $JAVA_OPTS -jar Kubernatedemo.jar

FROM openjdk:8-jdk-alpine
LABEL maintainer="byronthewolf@gmail.com"
WORKDIR /workspace
ADD target/app*.jar app.jar
ENV JAVA_OPTS=""
ENV userPoolId="us-east-1_owLUdNgFe"
ENV host="poll-instance.cnjb2mdxkwmw.us-east-1.rds.amazonaws.com"
ENV port="3306"
ENV database="geoserviciosbd"
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /workspace/app.jar
EXPOSE 8080
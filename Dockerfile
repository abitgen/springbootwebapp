FROM centos

RUN yum install java-11-openjdk-devel -y

VOLUME /tmp
EXPOSE 8081
ADD /spring-boot-web-0.0.1-SNAPSHOT.jar  myapp.jar
RUN sh -c 'touch /myapp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]
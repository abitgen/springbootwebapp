FROM centos

RUN yum install java-11-openjdk-devel -y

VOLUME /tmp
EXPOSE 8081
ADD /catalogapp-1.0-SNAPSHOT.jar  myapp.jar
RUN sh -c 'touch /myapp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]
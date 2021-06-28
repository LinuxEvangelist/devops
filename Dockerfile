FROM linuxevangelist/devops:latest
WORKDIR application

LABEL PROJECT_NAME=devops \
      PROJECT=com.rllontop:devops:jar:0.0.1-SNAPSHOT

EXPOSE 8080

WORKDIR application
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "org.springframework.boot.loader.JarLauncher"]
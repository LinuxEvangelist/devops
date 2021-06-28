FROM linuxevangelist/devops:latest
EXPOSE 8080
WORKDIR application
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "org.springframework.boot.loader.JarLauncher"]
FROM openjdk:17-oracle
Label org.opencontainers.image.title="pokedex-rest-service Docker Container" \
      org.opencontainers.image.description="This is fun Pokedex game in form of Restful API that returns Pokemon information." \
      org.opencontainers.image.authors="@ranjan1020"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
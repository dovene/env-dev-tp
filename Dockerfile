# Utiliser l'image JDK comme base
FROM openjdk:11-jre-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier les fichiers jar dans le conteneur
COPY target/tp-dev-env-1.jar /app/tp-dev-env-1.jar

# Commande pour exécuter l'application
CMD ["java", "-jar", "tp-dev-env-1.jar"]

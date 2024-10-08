#!/bin/bash

# Navigate to the project directory
cd "$(dirname "$0")"

# Clean and package the project using Maven
mvn clean package

# Run the application
java -cp target/tp-dev-env-1.jar com.dev.App
chmod +x ./gradlew

./gradlew bootJar

docker compose --env-file ./src/main/resources/.env up -d --build
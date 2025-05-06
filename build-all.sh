#!/bin/bash

export DOCKER_BUILDKIT=1

cd /Users/andrewscott/Desktop/hw3 || exit 1

# Ensure buildx is set up
if ! docker buildx inspect multiarch-builder &>/dev/null; then
  echo "🛠️  Creating buildx builder: multiarch-builder"
  docker buildx create --use --name multiarch-builder
  docker buildx inspect --bootstrap
fi

services=("discovery-service" "student-service" "course-service" "instructor-service")

for service in "${services[@]}"; do
  echo "🔄 Building $service..."
  cd "$service" || exit 1

  ../mvnw clean package -DskipTests

  docker buildx build \
    --platform linux/amd64,linux/arm64 \
    -t "scottandrew0814/$service:hw3" \
    --push \
    .

  echo "✅ $service image built and pushed."
  cd ..
done

echo "🚀 All services built and pushed for hw3!"

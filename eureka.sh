#!/bin/bash

# build gradle to docker image
cd eureka || exit 1
echo 'current dir: ' && pwd
docker rm -f sc-eureka &> /dev/null
echo 'build docker image...'
gradle DockerBuildImage

# root
cd - || exit 1

# docker run
cd docker-compose || exit 1
echo 'current dir: ' && pwd
echo 'docker run...'
docker-compose -f docker-compose.yml up -d eureka

#!/bin/bash

# build gradle to docker image
cd demo-server || exit 1
echo 'current dir: ' && pwd
docker rm -f sc-demo-server &> /dev/null
gradle DockerBuildImage

# root
cd - || exit 1

# docker run
cd docker-compose || exit 1
echo 'current dir: ' && pwd
docker-compose -f docker-compose.yml up -d demo-server

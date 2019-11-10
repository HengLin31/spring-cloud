#!/bin/bash

cd docker-compose || exit 1
echo 'current dir: ' && pwd
docker-compose -f docker-compose.yml up -d mysql

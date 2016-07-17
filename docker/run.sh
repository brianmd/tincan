#!/bin/sh
# note: must be run from the docker directory
mkdir -p m2
mkdir -p lein
docker run -ti --rm -p 127.0.0.1:7897:7897 -p 127.0.0.1:3500:3500 -v $(pwd -P)/..:/root/docker -v $(pwd -P)/m2:/root/.m2 -v $(pwd -P)/lein:/root/.lein -v $(pwd -P)/../../utils:/root/docker/checkouts/utils tincan /bin/bash

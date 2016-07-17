FROM clojure:latest

RUN apt-get update && \
    apt-get install -y sudo && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

RUN adduser --disabled-password --gecos '' clojure && \
    adduser clojure sudo && \
    echo '%sudo ALL=(ALL) NOPASSWD:ALL' >> /etc/sudoers

RUN mkdir -p /root/docker
WORKDIR /root/docker
ENV HOME /root

# 7897=nrepl, 7002=cljs-nrepl, 3449=http
EXPOSE 7897 7002 3449

# WORKDIR /home/clojure
# ENV HOME /home/clojure
# VOLUME ["/home/clojure"]

# USER clojure


# definicao da imagem
FROM maven:3.9-eclipse-temurin-21-noble

# desativar instalacao interativa
ENV DEBIAN_FRONTEND=noninteractive

# apt-get update: atualiza o repo de softwares
# apt-get install: instala as ferramentas a seguir
# apt-get clean: limpa arquivos temporarios
RUN apt-get update && apt-get install -y \
    mysql-server-8.0 \
    git \
    git-lfs \
    curl \
    unzip \
    zip \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

# Instructions on how to setup OracleDB (19c) on Docker

## What to do
### Prerequisites
1. Clone [oracle/docker-images](https://github.com/oracle/dockerimages)
2. Download the Oracle Database 19c binary .zip file
    - [here](http://www.oracle.com/technetwork/database/enterprise-edition/downloads/index.html)
3. Put the zip file under ```OracleDatabase/SingleInstance/dockerfiles/19.3.0``` directory
    - DO NOT UNZIP!
    - If you want to allocate more memory, set the ```totalMemory``` to whatever you like
        - ex) ```totalMemory=4000```
### Building
```
cd OracleDatabase/SingleInstance/dockerfiles
./buildDockerImage.sh -v 19.3.0 -e
```

### Running
- Sensible defaults (takes around 10-15 minutes)
```
docker run \
    --name oracle19c \
    -p 1521:1521 \
    -p 5500:5500 \
    -e ORACLE_PDB=orcl \
    -e ORACLE_PWD=password \
    -e ORACLE_MEM=4000 \
    -v /opt/oracle/oradata \
    -d \
    oracle/database:19.3.0-ee
```

## Reference
- steveswinsburg oracle19c-docker
    - [oracle19c-docker](https://github.com/steveswinsburg/oracle19c-docker.git)

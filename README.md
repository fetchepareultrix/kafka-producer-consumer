# kafka-producer-consumer
Basic Spring Boot application with a Kafka Producer module and a Kafka Consumer module.

## Requirements
- Maven ([Apache Maven][maven])
- Java ([OpenJDK 21 (LTS)][java download])
- Apache Tomcat 10 ([download][Apache Tomcat 10])
- Apache Kafka ([download][kafka download])

As an alternative to manual instalation you can use [SDKMAN!][SDKMAN!].

[maven]: https://maven.apache.org/
[java download]: https://www.oracle.com/ar/java/technologies/downloads/#java21
[SDKMAN!]: https://sdkman.io/
[Apache Tomcat 10]: https://tomcat.apache.org/download-10.cgi
[kafka download]: https://kafka.apache.org/downloads

## Kafka Setup
In order to run this project you have to:

1) Open terminal and go to Kafka directory

2) Start ZooKeeper service:

```bash
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```

3) Start Kafka server

```bash
$ bin/kafka-server-start.sh config/kraft/server.properties
```

## Run project
4) Open this project in your prefered IDE and run:

a) SpringBootConsumerApplication
b) SpringBootProducerApplication
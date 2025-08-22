# Hello World with Spring Boot and Docker

A simple "Hello World" application built with Spring Boot and Docker.

## Prerequisites

- Docker **version 27.5.1** or higher
**or**
- Java **version 21** or higher
- Git **version 2.34.1** or higher
## Using docker :

1.Pull the Docker image:
   ```bash
   docker pull mateusdev26/helloworld-springboot:latest
   ```

2.Execute the container 
  ```bash
   docker run -it -p 8080:8080 mateusdev26/helloworld-springboot:latest
  ```

3.And view the Hello World in th browser **http://localhost:8080/hello-world**

## Using Java :

1.Clone the Git repository:
   ```bash
   git clone git@github.com:mateusdev26/helloworld-springboot.git
   ```

2.Execute the .jar:
  ```bash
  java -jar helloworld-springboot/target/*.jar
  ```

3.And view the Hello World in th browser **http://localhost:8080/hello-world**





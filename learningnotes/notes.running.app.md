# How to package and run


### 1. Build
- ./mvnw package   --- creates the jar file

### 2. Run the code
- java -jar mycoolapp.jar
    - self-contained unit, no need to install other stuff
- ./mvnw spring-boot::run
    - mvn clean compile test
    - using spring boot cmd
    - no need to have mvn installed

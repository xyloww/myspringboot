# Learning Points
## pom.xml
### groupId
1. is like the city
2. Name of company or organization
3. convention is to use reverse domain name e.g. com.myspringboot

### artifactId 
1. is the street
2. Name of the project e.g. mycoolproj
   
### version  
1. is the house
2. Specific version e.g. 1.0 2.1
3. If the project is under active development, can use 1.0-SNAPSHOT

### example 1
  Saves time for developers, no need to list every single dependencies 
  
  		<dependency>
			<groupId>org.springframework.boot</groupId> -- a collection of Maven dependencies
			<artifactId>spring-boot-starter-web</artifactId> -- springweb, tomcat, json...
		</dependency>
  
To package to executable jar/war files, can also easily run the app

[mvn package]   
[mvn spring-boot:run]

   
  	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>





  ### example 2
Specify version of spring boot
```
	</project>
	        <parent>
	                <groupId>org.springframework.boot</groupId>
	                <artifactId>spring-boot-starter-parent</artifactId>
	                <version>2.5.2</version>
	                <relativePath/>
	        </parent>
	        <dependencies>
	                <!-- Spring Boot Starter Web dependency -->
	                <dependency>
	                        <groupId>org.springframework.boot</groupId>
	                        <artifactId>spring-boot-starter-web</artifactId>  <--- inherit version from starter parent
	                </dependency>
	        </dependencies>
	</project>
```








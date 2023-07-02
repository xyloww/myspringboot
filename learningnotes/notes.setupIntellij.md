# To enable auto spring build

1. Enable "Build projects automatically"
2. Enable "Allow auto-make to start even if ...."
3. edit pom.xml to include spring-boot-devtools

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>

```

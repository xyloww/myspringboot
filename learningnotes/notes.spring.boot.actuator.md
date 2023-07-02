# Check on app health
- /actuator/health 
- /actuator/info
- /actuator/beans
- /actuator/threaddump
- /actuator/mappings
  
1. Add dependency
   ```
   		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
   ```
2. Edit application.properites
   ```
   management.endpoints.web.exposure.include=health,info
   management.info.env.enabled=true
   ```
3. add Security dependency
   - /login
   ```
   		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
   ```
5. 

# Application Properties
Spring Boot will load properties from Application Properties

\# Configure server port

server.port = 1243

\# Configure my props

coach.name = Mickey Mouse


@RestController 

public class FunRestController{

      @Value("$(coach.name)")
      
      private String coachName;
      
}

package pb.spring.controllers.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pb.spring.dependencyinjection.services.GreetingService;
@Controller
public class ConstructorBasedController {

  private final  GreetingService greetingService;

    public ConstructorBasedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

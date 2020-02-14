package pb.spring.controllers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pb.spring.dependencyinjection.services.GreetingService;

@Controller
public class PropertyInjectedController {


    //@Qualifier("propertyInjectedService") -- not used so primary bean will be used
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

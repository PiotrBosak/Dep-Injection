package pb.spring.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pb.spring.dependencyinjection.services.GreetingService;
@Controller
public class SetterBasedController {

    private GreetingService greetingService;
@Qualifier("setterGreetingService")
@Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

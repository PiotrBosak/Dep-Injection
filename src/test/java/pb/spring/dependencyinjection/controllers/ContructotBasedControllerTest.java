package pb.spring.dependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pb.spring.dependencyinjection.services.ConstructorGreetingService;

class ContructotBasedControllerTest {
    ConstructorBasedController contructotBasedController;
    @BeforeEach
    void setUp() {
        ConstructorGreetingService service = new ConstructorGreetingService();
      contructotBasedController  = new ConstructorBasedController(service);
    }

    @Test
    void getGreeting() {
        System.out.println(contructotBasedController.getGreeting());
    }
}
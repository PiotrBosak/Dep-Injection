package pb.spring.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pb.spring.dependencyinjection.controllers.ConstructorBasedController;
import pb.spring.dependencyinjection.controllers.MyController;
import pb.spring.dependencyinjection.controllers.PropertyInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String s = myController.sayHello();
		//System.out.println(s);

		ConstructorBasedController constructorBasedController = (ConstructorBasedController) ctx.getBean("constructorBasedController");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");



		System.out.println(constructorBasedController.getGreeting());
		System.out.println(propertyInjectedController.getGreeting());


	}

}

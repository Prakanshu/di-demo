package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DiDemoApplication.class, args);
		MyController myController = (MyController) run.getBean("myController");
	

		// DI with Spring Framework
		System.out.println(myController.hello());
		System.out.println(run.getBean(PropertyInjectedController.class).sayHello());
	    System.out.println(run.getBean(SetterInjectedController.class).sayHello());
		System.out.println(run.getBean(ConstructorInjectedController.class).sayHello());
	}

}

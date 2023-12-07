package com.example.demo;

import com.example.demo.bussineslayer.HelloEvent;
import com.example.demo.bussineslayer.PojoEvent;
import com.example.demo.bussineslayer.mycar.Car;
import com.example.demo.bussineslayer.mycar.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@SpringBootApplication
@PropertySource("classpath:user.properties")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Component
class Runner implements CommandLineRunner {
	private final ApplicationEventPublisher eventPublisher;
	@Autowired
	private Environment env;

	public Runner(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	@Override
	public void run(String... args) throws InterruptedException {
		System.out.println("The application was started");
		HelloEvent event = new HelloEvent(this, "Hello Event");
		eventPublisher.publishEvent(event);
		Thread.sleep(500);
		eventPublisher.publishEvent(new PojoEvent());

		System.out.println("MyCar code:");
		var context = new AnnotationConfigApplicationContext(Config.class);
		//Car myCar = context.getBean(Car.class);
		Car myCar = context.getBean("tesla", Car.class);
		System.out.println(myCar.getName());
		System.out.println(myCar.getEngine().getBrand());

		System.out.println("KEY is: " + env.getProperty("MY_KEY"));
		System.out.println("USER NAME is: " + env.getProperty("USER_NAME"));

		System.out.println("The application was ended");
	}
}
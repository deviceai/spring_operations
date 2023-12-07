package com.example.demo;

import com.example.demo.bussineslayer.HelloEvent;
import com.example.demo.bussineslayer.PojoEvent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Component
class Runner implements CommandLineRunner {
	private final ApplicationEventPublisher eventPublisher;

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
		System.out.println("The application was ended");
	}
}
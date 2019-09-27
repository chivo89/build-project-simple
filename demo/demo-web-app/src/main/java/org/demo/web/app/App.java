package org.demo.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"org.demo.web.app", "org.demo.service.logic"})
public class App{

	 public static void main(String[] args) {
	        SpringApplication.run(App.class, args);
	 }

}

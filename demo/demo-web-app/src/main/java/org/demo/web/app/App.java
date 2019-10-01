package org.demo.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"org.demo.web.app","org.demo.service.logic","com.demo","target.generated-sources.annotations.com.demo"})
public class App{

	 public static void main(String[] args) {
	        SpringApplication.run(App.class, args);
	 }

}

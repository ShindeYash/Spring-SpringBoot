package com.DependencyInjectionLearning.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		// This Line Creates the Spring(loc) Container in the JVM.
		ApplicationContext contextObj = SpringApplication.run(DependencyInjectionApplication.class, args);

		Dev devObj = contextObj.getBean(Dev.class);

		devObj.build();
	}

}

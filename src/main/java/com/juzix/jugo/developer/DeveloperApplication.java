package com.juzix.jugo.developer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeveloperApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new DeveloperApplication()
				.configure(new SpringApplicationBuilder(DeveloperApplication.class))
				.run(args);
	}
}

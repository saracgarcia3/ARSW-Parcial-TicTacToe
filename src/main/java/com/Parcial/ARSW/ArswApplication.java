package com.Parcial.ARSW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArswApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ArswApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));
		app.run(args);

	}
	static int getPort() {
		string p =System.getenv.parseInt(p) : 8080;
	}

}




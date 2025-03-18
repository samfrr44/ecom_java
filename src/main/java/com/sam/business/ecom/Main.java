package com.sam.business.ecom;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableRabbit
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}

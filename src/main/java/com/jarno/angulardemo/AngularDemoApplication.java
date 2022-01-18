package com.jarno.angulardemo;

import java.util.stream.Stream;

import com.jarno.angulardemo.models.User;
import com.jarno.angulardemo.repositories.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AngularDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularDemoApplication.class, args);
	}
	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Juha-Matti", "Veli-Pekka").forEach(name -> {
				User user = new User(name, name.toLowerCase()+"@esimerkki.com");
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}

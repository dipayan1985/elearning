package com.elearning;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.elearning.model.User;
import com.elearning.repository.UserRepository;

@SpringBootApplication
public class StartBookApplication {

	// start everything
	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(StartBookApplication.class, args); }
	 */

	// run this only on profile 'demo', avoid run this in test
	@Profile("demo")
	@Bean
	CommandLineRunner initDatabase(UserRepository repository) {
		return args -> {

			User user = new User();
			user.setFirstName("Rizma");
			user.setLastName("Begam");
			user.setId(1001);
			user.setCreatedAt(new Date());
			user.setEmail("test");
			user.setCreatedBy("test");
			user.setUpdatedAt(new Date());
			user.setUpdatedBy("");
			repository.save(user);

		};
	}
}
package com.fmahadybd.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

import com.fmahadybd.book.role.Role;
import com.fmahadybd.book.role.RoleRepository;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class BootNetworkingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootNetworkingApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(RoleRepository roleRepository) {
		return args -> {
			if (roleRepository.findByName("USER").isEmpty()) {
				roleRepository.save(
						Role.builder().name("USER").build());
			}
		};
	}

}

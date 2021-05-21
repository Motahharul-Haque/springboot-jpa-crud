package com.ss.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ss.jpa.entities.User;
import com.ss.jpa.repository.UserRepository;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		/*
		 * User user1 = new User(); user1.setName("Malik"); user1.setCity("Meerut");
		 * user1.setStatus("Java Developer"); userRepository.save(user1);
		 * 
		 * User user2 = new User(); user2.setName("Himanshi");
		 * user2.setCity("Greater Noida"); user2.setStatus("DB Admin");
		 * userRepository.save(user2);
		 */
		
		Optional<User> optional = userRepository.findById(100);
		User user3 = optional.get();
		user3.setCity("Lucknow");
		userRepository.save(user3);
		
		List<User> findByName = userRepository.findByName("Motahharul Haque");
		findByName.forEach(user -> System.out.println(user));
		
		List<User> findByNameAndCity = userRepository.findByNameAndCity("Abhishek","Patna");
		findByNameAndCity.forEach(user -> System.out.println(user));
	}

}

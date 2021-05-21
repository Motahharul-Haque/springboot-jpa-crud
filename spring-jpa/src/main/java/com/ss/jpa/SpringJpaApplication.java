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
		 * User user = new User(); user.setName("Motahharul Haque");
		 * user.setCity("Delhi"); user.setStatus("Java Trainee");
		 * 
		 * 
		 * 
		 * User user1 = new User(); user1.setName("Rawshan"); user1.setCity("Noida");
		 * user1.setStatus("Cloud Trainee"); userRepository.save(user1);
		 * 
		 * 
		 * 
		 * User user1 = userRepository.save(user); System.out.println(user1);
		 * 
		 * 
		 * 
		 * Optional<User> optional = userRepository.findById(1); User user =
		 * optional.get(); user.setCity("Darbhanga"); userRepository.save(user);
		 * 
		 * 
		 * userRepository.deleteById(2);
		 * 
		 * Iterable<User> userAll = userRepository.findAll();
		 * 
		 * userAll.forEach(user -> System.out.println(user));
		 */
		
		/*
		 * List<User> findByName = userRepository.findByName("Qumruzzama");
		 * findByName.forEach(user -> System.out.println(user));
		 */
		
		List<User> findByNameAndCity = userRepository.findByNameAndCity("Qumruzzama","Meerut");
		findByNameAndCity.forEach(user -> System.out.println(user));
		
	}

}

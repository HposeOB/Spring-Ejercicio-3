package com.example.springEjercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringEjercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringEjercicio3Application.class, args);
		TelefonoRepository repository = context.getBean(TelefonoRepository.class);

		System.out.println("Numero de elementos: " + repository.count());

		Telefono oneplus = new Telefono(null, "OnePlus", 6.79F, 3);
		repository.save(oneplus);
		System.out.println("Numero de elementos: " + repository.count());
		System.out.println(repository.findAll());
	}

}

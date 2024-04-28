package com.Aspect.AOP_Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AopPracticeApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Bean_Config.class);

		ShoppingCart cart = context.getBean(ShoppingCart.class);
		cart.checkout("CANCELLED");
		cart.quantity();
	}
}



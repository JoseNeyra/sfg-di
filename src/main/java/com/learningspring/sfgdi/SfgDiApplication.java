package com.learningspring.sfgdi;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.learningspring.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by jose- on 8/17/2021
 **/

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// Obtaining the Application Context from Spring
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("----------- Profiles");
		// Asking the Spring Application Context for a MyController Bean (Not creating a new one)
		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		System.out.println();


		System.out.println("----------- Primary");
		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.sayHello());
		System.out.println();

		System.out.println("----------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println();

		System.out.println("----------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println();

		System.out.println("----------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}

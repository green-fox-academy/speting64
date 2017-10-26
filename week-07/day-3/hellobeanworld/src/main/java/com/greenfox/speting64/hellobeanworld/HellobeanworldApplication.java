package com.greenfox.speting64.hellobeanworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import com.greenfox.speting64.hellobeanworld.services.TextEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanworldApplication {

	//@Autowired
	//HelloWorld helloWorld;

	public static void main(String[] args) {

		ApplicationContext ctx =new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}


package com.greenfox.speting64.hellobeanworld;

import com.greenfox.speting64.hellobeanworld.colors.GreenColor;
import com.greenfox.speting64.hellobeanworld.colors.MyColor;
import com.greenfox.speting64.hellobeanworld.colors.YellowColor;
import com.greenfox.speting64.hellobeanworld.colors.ColorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import com.greenfox.speting64.hellobeanworld.services.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanworldApplication {


	public static void main(String[] args) {

		ApplicationContext getHello =new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = getHello.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();

		ApplicationContext getColor =new AnnotationConfigApplicationContext(ColorConfig.class);
		MyColor yellow = getColor.getBean(YellowColor.class);
		yellow.printColor();

		MyColor green = getColor.getBean(GreenColor.class);
		green.printColor();



	}
}


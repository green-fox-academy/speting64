package com.greenfox.speting64.springstart;

import com.greenfox.speting64.springstart.controllers.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringstartApplication {

	@RequestMapping(value = "/hello")
	@ResponseBody

	public String Hello(){
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringstartApplication.class, args);
	}


}

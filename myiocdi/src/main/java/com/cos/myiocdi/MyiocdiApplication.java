package com.cos.myiocdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyiocdiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyiocdiApplication.class, args);
	}
	
	@Bean  // Ioc (리턴값을 IoC컨테이너에 저장)
	public Robot getRobot( ) { //  누군가가 getRobot()을 호출하면 리턴값을 IoC컨테이너에 등록하고 싶을때 @Bean사용!!
		return new Robot();
	}

}

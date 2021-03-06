package com.cos.myiocdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Component(용도없음), Configuration(설정파일), Service(서비스), Repository(레퍼지토리), Bean

// RestController, Controller -> IoC(싱글톤) 등록해준다. new PostController(주입); 
@RestController
public class PostController {
	
	private final Robot robot; 
	
	public PostController(Robot robot) { // DI(의존성주입)
		super();
		this.robot = robot;
	}


	@GetMapping("/")
	public String home() {
		return "home " +robot.getName();
	}
}

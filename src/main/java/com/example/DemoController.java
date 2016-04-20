package com.example;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
@RequestMapping("/hello")
	public String Hello(){
		return "Hello World"; 
	}

@RequestMapping("/")
public String Session(HttpSession session){
	UUID uniqueId = (UUID) session.getAttribute("uid");
	if(uniqueId == null){
		uniqueId = UUID.randomUUID();
	}
	session.setAttribute("uid", uniqueId);
	return uniqueId.toString();
	
}
}

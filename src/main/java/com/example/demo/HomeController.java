package com.example.demo;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public Map<String, String> Home(){
	    HashMap<String, String> map = new HashMap<>();
	    map.put("nome", "gustavo melo");
	    return map;
	}
	
	@PostMapping("/add") 
	public void add() {
		System.out.print("post");
	}
}

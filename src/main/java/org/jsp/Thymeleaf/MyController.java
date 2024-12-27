package org.jsp.Thymeleaf;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/")
	public String load1() {
		return "Index.html";
	}
	
	@GetMapping("/otp")
	public String otp (ModelMap map) {
		map.put("otp", new Random().nextInt(100000, 1000000));
		return "Index.html";
	}
	
	
	 @PostMapping("/circle")
	 public String circle(ModelMap map, @RequestParam String color, @RequestParam int height, @RequestParam int width) {
		 map.put("color", color);
		 map.put("height", height);
		 map.put("width", width);
		 return "Index.html";
	 }
}

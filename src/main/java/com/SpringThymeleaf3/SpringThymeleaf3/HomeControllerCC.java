package com.SpringThymeleaf3.SpringThymeleaf3;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllerCC {
	
	   @Value("${welcome.message}")
	    private String message;
	
	   
//	    private List<String> tasks = Arrays.asList("Nawara kc", "Nisum Giri", "Ujjwol Kc", "Sabnam neupane");
	    

	    
	    
	    String[] tasks = {"Nawara kc", "Nisum Giri", "Ujjwol Kc", "Sabnam neupane","Anita timsena"};

	
	@GetMapping("/")
	public String home(Model model) {		
        model.addAttribute("tasks", tasks);
		model.addAttribute("msg",message);
		return "home";
	}
	
	@GetMapping("/nextPage")
	public String nextPage(Model model) {		
        model.addAttribute("tasks", tasks);
		model.addAttribute("msg",message);
		return "nextPagehtml";
	}
	

}

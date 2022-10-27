package com.nhom12shop.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
<<<<<<< Updated upstream

    @GetMapping("")
    public String index() {
        return "index";
    }
=======
	
	@GetMapping("") 
	public String index() {
		return "main";
	}
>>>>>>> Stashed changes
}

package br.com.alura.mvc.mudi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
//	@GetMapping("/hello")
//	public String hello(HttpServletRequest request) {  // pode-se usar assim tambem, mas nao eh comum
//		request.setAttribute("nome", "Mundo");
//		return "hello";		
//	}
	
	@GetMapping("/hello")
	public String hello(Model model) {  // assim eh mais usado, com o Model, nao precisa usar a camada mais a baixo (HttpServeletRequest)
		model.addAttribute("nome", "Mundo");
		return "hello";		
	}

}

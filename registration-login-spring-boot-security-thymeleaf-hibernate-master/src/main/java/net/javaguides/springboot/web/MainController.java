package net.javaguides.springboot.web;

import net.javaguides.springboot.model.Scheme;
import net.javaguides.springboot.service.SchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

	@Autowired
	private SchemeService schemeService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Scheme> schemeList = schemeService.findAll();
		model.addAttribute("schemes", schemeList);
		return "dashboard";
	}

	@GetMapping("/calculate")
	public String calculate() {
		return "calculate";
	}

	@GetMapping("/admin")
	public String adminpage() {
		return "admin";
	}


}

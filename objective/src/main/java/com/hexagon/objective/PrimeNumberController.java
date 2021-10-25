package com.hexagon.objective;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PrimeNumberController {

	@GetMapping("/index")
	public String GetForm(Model model) {
		model.addAttribute("PrimeNumberBean", new PrimeNumberBean());
		return "index";
	}
	
	@PostMapping("/primeForm")
	public String PostForm(@ModelAttribute PrimeNumberBean PrimeNumberBean, BindingResult result,
            Model model) {
		
		PrimeNumClass primeNum = new PrimeNumClass();
		
		PrimeNumberBean = primeNum.generatePrimeNum(PrimeNumberBean);
		
		model.addAttribute("PrimeNumberBean", PrimeNumberBean);
		return "result";
	}

}

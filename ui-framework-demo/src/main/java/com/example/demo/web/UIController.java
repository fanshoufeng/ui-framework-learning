package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

	@GetMapping("/ui")
    public String index(String name, Model model) {
		switch(name) {
		case "easyui":
			model.addAttribute("name", "Easy UI");
			break;
		case "kendoui":
			model.addAttribute("name", "Kendo UI");
			break;
		case "webix":
			model.addAttribute("name", "Webix");
			break;
		}
        return name;
    }
	
}

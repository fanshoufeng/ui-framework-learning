package com.example.demo.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

	@GetMapping("/ui")
    public String index(String name, Model model) {
		String template;
		switch(name) {
		case "easyui":
			model.addAttribute("name", "Easy UI");
			template = "/easyui/" + name;
			break;
		case "kendoui":
			model.addAttribute("name", "Kendo UI");
			template = "/kendoui/" + name;
			break;
		case "webix":
			model.addAttribute("name", "Webix");
			template = "/webix/" + name;
			break;
		default:
			model.addAttribute("name", name);
			template = "default";
			break;
		}
        return template;
    }
	
}

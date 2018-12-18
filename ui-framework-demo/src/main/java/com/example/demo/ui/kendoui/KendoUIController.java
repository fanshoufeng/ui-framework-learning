package com.example.demo.ui.kendoui;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IDataService;

@RestController
@RequestMapping("/kendoui")
public class KendoUIController {

	@Autowired
	private IDataService dataService;
	
	@GetMapping("/list")
    public Map<String, Object> list(int page, int pageSize) {
		return dataService.list(page, pageSize);
    }
	
}

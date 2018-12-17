package com.example.demo.ui.webix;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IDataService;

@RestController
@RequestMapping("/webix")
public class WebixController {

	@Autowired
	private IDataService dataService;
	
	@GetMapping("/list")
    public Map<String, Object> list(int start, int count) {
		return dataService.list(start, count);
    }
	
}

package com.example.demo.ui.easyui;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IDataService;

@RestController
@RequestMapping("/easyui")
public class EasyUIController {

	@Autowired
	private IDataService dataService;
	
	@GetMapping("/list")
    public Map<String, Object> list(int page, int rows) {
		return dataService.list(page, rows);
    }
	
}

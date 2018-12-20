package com.example.demo.ui.webix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Data;

@RestController
@RequestMapping("/webix")
public class WebixController {

	@GetMapping("/list")
	public Map<String, Object> list(@RequestParam(name = "start", required = false, defaultValue = "1") int start,
			@RequestParam(name = "count", required = false, defaultValue = "10") int pageSize) {
		Map<String, Object> result = new HashMap<>();
        List<Data> list = new ArrayList<>();
        
        String cmcustCode,
        	cmcustName,
        	cmcustStatus,
        	cmcustManager,
        	cmcustGrpcode,
        	cmcustParentname,
        	cmcustCurid,
        	cmcustPhone,
        	cmcustAddr01;
        int page = start;
        if (start > 1) {
        	page = start / pageSize + 1;
        }
        int number;
        int total = 28;
        int forSize = pageSize;
        if (pageSize * page > total) {
        	forSize = total - pageSize * (page - 1);
        }
        Random random = new Random();
        for (int i = 0; i < forSize; i++) {
        	number = random.nextInt(100);
        	cmcustStatus = "活动";
        	cmcustPhone = "";
        	if (i % 2 == 0) {
        		cmcustCode = "BJ000" + number;
        		cmcustName = "北京客户 " + number;
        		cmcustManager = "王五";
        		cmcustGrpcode = "北京客户";
        		cmcustParentname = "";
        		cmcustCurid = "CNY";
        		cmcustAddr01 = "北京市xxx";
        	} else {
        		cmcustCode = "SH000" + number;
        		cmcustName = "上海客户 " + number;
        		cmcustManager = "张三";
        		cmcustGrpcode = "上海客户";
        		cmcustParentname = "";
        		cmcustCurid = "USD";
        		cmcustAddr01 = "上海市xxx";
        	}
        	list.add(new Data(cmcustCode, cmcustName, cmcustStatus, cmcustManager, cmcustGrpcode, cmcustParentname, cmcustCurid, cmcustPhone, cmcustAddr01));
        }
        
        result.put("data", list);
        result.put("pos", (page - 1) * pageSize);
        result.put("total_count", total);
		return result;
	}

}

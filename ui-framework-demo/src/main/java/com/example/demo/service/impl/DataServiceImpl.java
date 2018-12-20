package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demo.model.Data;
import com.example.demo.service.IDataService;

@Service
public class DataServiceImpl implements IDataService {

	/* (non-Javadoc)
	 * @see com.example.demo.service.IDataService#list(int, int)
	 */
	@Override
	public Map<String, Object> list(int page, int pageSize) {
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
        
        result.put("rows", list);
        result.put("total", total);
		return result;
	}

}

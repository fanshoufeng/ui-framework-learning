package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.service.IDataService;
import com.example.demo.ui.model.Data;

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
        for (int i = 1; i <= pageSize; i++) {
        	number = page + i;
        	cmcustStatus = "活动";
        	cmcustPhone = "";
        	if (i % 2 == 0) {
        		cmcustCode = "BJ000" + number;
        		cmcustName = "北京客户000" + number;
        		cmcustManager = "王五" + number;
        		cmcustGrpcode = "北京客户";
        		cmcustParentname = "";
        		cmcustCurid = "CNY";
        		cmcustAddr01 = "北京市xxx";
        	} else {
        		cmcustCode = "SH000" + number;
        		cmcustName = "上海客户000" + number;
        		cmcustManager = "张三" + number;
        		cmcustGrpcode = "上海客户";
        		cmcustParentname = "";
        		cmcustCurid = "USD";
        		cmcustAddr01 = "上海市xxx";
        	}
        	list.add(new Data(cmcustCode, cmcustName, cmcustStatus, cmcustManager, cmcustGrpcode, cmcustParentname, cmcustCurid, cmcustPhone, cmcustAddr01));
        }
        
//        list.add(new Data("EST-1", "FI-SW-01", "Koi", 10.00, "P", 36.50, "Large"));
//        list.add(new Data("EST-10", "K9-DL-01", "Dalmation", 12.00, "P", 18.50, "Spotted Adult Female"));
//        list.add(new Data("EST-11", "RP-SN-01", "Rattlesnake", 12.00, "P", 38.50, "Venomless"));
//        list.add(new Data("EST-12", "RP-SN-01", "Rattlesnake", 12.00, "P", 26.50, "Rattleless"));
//        list.add(new Data("EST-13", "RP-LI-02", "Iguana", 12.00, "P", 35.50, "Green Adult"));
//        list.add(new Data("EST-14", "FL-DSH-01", "Manx", 12.00, "P", 158.50, "Tailless"));
//        list.add(new Data("EST-15", "FL-DSH-01", "Manx", 12.00, "P", 83.50, "With tail"));
//        list.add(new Data("EST-16", "FL-DLH-02", "Persian", 12.00, "P", 23.50, "Adult Female"));
//        list.add(new Data("EST-17", "FL-DLH-02", "Persian", 12.00, "P", 89.50, "Adult Male"));
//        list.add(new Data("EST-18", "AV-CB-01", "Amazon Parrot", 92.00, "P", 63.50, "Adult Male"));
        
        result.put("rows", list);
        result.put("total", 28);
		return result;
	}

}

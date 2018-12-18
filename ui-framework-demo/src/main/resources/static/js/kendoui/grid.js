$(function(){
	$("#grid").kendoGrid({
        dataSource: {
            transport: {
                read: "kendoui/list",
                dataType: "json"
            },
            serverPaging: true,
            pageSize: 10,
            schema: {
            	data: "rows",
			    total: "total"
			}
        },
        height: 455,
        pageable: {
            refresh: true,
            pageSizes: true,
            buttonCount: 5
        },
        columns: [{
            field:'cmcustCode',
	    	title:'客户编号',
	    	width:150
        }, {
            field:'cmcustName',
	    	title:'客户名',
	    	width:200,
	    	template: function(dataItem) {
	    		var cmcustName = dataItem.cmcustName;
	    		if (cmcustName) {
					return '<a href="javascript:;" onclick="return false;">'+cmcustName+'</a>';
				} else {
					return cmcustName;
				}
		    }
        }, {
	    	field:'cmcustStatus',
	    	title:'状态',
	    	width:70
	    }, {
	    	field:'cmcustManager',
	    	title:'负责经理',
	    	width:120
	    }, {
	    	field:'cmcustGrpcode',
	    	title:'伙伴组',
	    	width:150
	    }, {
	    	field:'cmcustParentname',
	    	title:'母公司',
	    	width:200
	    }, {
	    	field:'cmcustCurid',
	    	title:'币种',
	    	width:60
	    }, {
	    	field:'cmcustPhone',
	    	title:'电话',
	    	width:130
	    }, {
	    	field:'cmcustAddr01',
	    	title:'地址',
	    	width:190
        }]
    });
});
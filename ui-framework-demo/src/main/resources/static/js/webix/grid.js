webix.ready(function(){
	grida = webix.ui({
		container:"testA",
		view:"datatable",
		columns:[{
			id:"cmcustCode",
			header:"客户编号",
	    	width:150
		}, {
			id:'cmcustName',
			header:'客户名',
	    	width:200,
	    	template:function(obj) {
	    		var cmcustName = obj.cmcustName;
	    		if (cmcustName) {
					return '<a href="javascript:;" onclick="return false;">'+cmcustName+'</a>';
				} else {
					return cmcustName;
				}
			}
		}, {
			id:'cmcustStatus',
			header:'状态',
	    	width:70
	    }, {
	    	id:'cmcustManager',
	    	header:'负责经理',
	    	width:120
	    }, {
	    	id:'cmcustGrpcode',
	    	header:'伙伴组',
	    	width:150
	    }, {
	    	id:'cmcustParentname',
	    	header:'母公司',
	    	width:200
	    }, {
	    	id:'cmcustCurid',
	    	header:'币种',
	    	width:60
	    }, {
	    	id:'cmcustPhone',
	    	header:'电话',
	    	width:130
	    }, {
	    	id:'cmcustAddr01',
	    	header:'地址',
	    	width:190
		}
		],
		select:"cell",
		autowidth:true,
		pager:{
			container:"paging_here",
			size:10,
			group:5
		},
		url:"webix/list"
	});	
});
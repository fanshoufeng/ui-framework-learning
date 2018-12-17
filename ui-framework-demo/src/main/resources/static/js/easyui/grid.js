$(function(){
	$('#dg').datagrid({
	    rownumbers:true,
	    pagination:true,
	    striped:true,
	    singleSelect:true,
	    url:'easyui/list',
	    method:'get',
	    columns:[[{
	    	field:'cmcustCode',
	    	title:'客户编号',
	    	width:150
	    }, {
	    	field:'cmcustName',
	    	title:'客户名',
	    	width:200,
	    	formatter: function(value,row,index){
				if (value) {
					return '<a href="javascript:;" onclick="return false;">'+value+'</a>';
				} else {
					return value;
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
	    }
	    ]],
	    onClickCell: function(index, field, value) {
	    	if (field == 'cmcustName' && value) {
	    		$('#win').window('open');
	    	}
	    }
	});
	
	$('#win').window({
		title: '客户明细',
//	    width:'100%',
		width: 500,
		height: 150,
	    modal:true,
	    closed:true
	});
	
	/*$('#cmcustCode').textbox({
		label: '客户编号:',
		labelWidth: 100,
		width: '25%',
		disabled: true
	});
	$('#cmcustName').textbox({
		label: '客户名:',
		labelWidth: 100,
		width: '25%',
		disabled: true
	});*/
})
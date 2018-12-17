package com.example.demo.model;

public class Data {

	private String itemid;
	private String productid;
	private String productname;
	private double unitcost;
	private String status;
	private double listprice;
	private String attr1;
	
	public Data(String itemid, String productid, String productname, double unitcost, String status, double listprice,
			String attr1) {
		this.itemid = itemid;
		this.productid = productid;
		this.productname = productname;
		this.unitcost = unitcost;
		this.status = status;
		this.listprice = listprice;
		this.attr1 = attr1;
	}
	
	/**
	 * @return the itemid
	 */
	public String getItemid() {
		return itemid;
	}
	/**
	 * @return the productid
	 */
	public String getProductid() {
		return productid;
	}
	/**
	 * @return the productname
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * @return the unitcost
	 */
	public double getUnitcost() {
		return unitcost;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @return the listprice
	 */
	public double getListprice() {
		return listprice;
	}
	/**
	 * @return the attr1
	 */
	public String getAttr1() {
		return attr1;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Data [itemid=" + itemid + ", productid=" + productid + ", productname=" + productname + ", unitcost="
				+ unitcost + ", status=" + status + ", listprice=" + listprice + ", attr1=" + attr1 + "]";
	}
	
}

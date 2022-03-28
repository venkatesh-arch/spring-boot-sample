package com.product;

public class Product {

	private int id;  
	private String pname;  
	private String batchno;  
	private double price;  
	private int noofproduct;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return the batchno
	 */
	public String getBatchno() {
		return batchno;
	}
	/**
	 * @param batchno the batchno to set
	 */
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the noofproduct
	 */
	public int getNoofproduct() {
		return noofproduct;
	}
	/**
	 * @param noofproduct the noofproduct to set
	 */
	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}
	public Product(int id, String pname, String batchno, double price, int noofproduct) {
		super();
		this.id = id;
		this.pname = pname;
		this.batchno = batchno;
		this.price = price;
		this.noofproduct = noofproduct;
	}
 
	
	
}

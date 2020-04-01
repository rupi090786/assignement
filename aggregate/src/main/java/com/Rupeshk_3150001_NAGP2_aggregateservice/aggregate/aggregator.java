package com.Rupeshk_3150001_NAGP2_aggregateservice.aggregate;


public class aggregator {
	
	private Integer id;
	private Integer orderID;
	private double orderAmount;
	private String orderdate;
	/**
	 * @param id
	 * @param orderID
	 * @param orderAmount
	 * @param orderdate
	 */
	public aggregator(Integer id, Integer orderID, double orderAmount, String orderdate) {
		super();
		this.id = id;
		this.orderID = orderID;
		this.orderAmount = orderAmount;
		this.orderdate = orderdate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "aggregator [id=" + id + ", orderID=" + orderID + ", orderAmount=" + orderAmount + ", orderdate="
				+ orderdate + "]";
	}
}
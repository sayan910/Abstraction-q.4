package com.model;

public class Item {
	private String itemName;
	private float itemCost;
	private float totalCost;
	public Item(String itemName, float itemCost, float totalCost) {
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.totalCost = totalCost;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemCost() {
		return itemCost;
	}
	public void setItemCost(float itemCost) {
		this.itemCost = itemCost;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	
	

}

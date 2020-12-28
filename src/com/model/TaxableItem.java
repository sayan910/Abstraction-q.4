package com.model;

public class TaxableItem extends Item {
	private float GST;
	private float taxAmount;
	public TaxableItem(String itemName, float itemCost, float totalCost, float gST, float taxAmount) {
		super(itemName, itemCost, totalCost);
		// TODO Auto-generated constructor stub
		GST=gST;
		this.taxAmount=taxAmount;
		
		
	}
	public float getGST() {
		return GST;
	}
	public void setGST(float gST) {
		GST = gST;
	}
	public float getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(float taxAmount) {
		this.taxAmount = taxAmount;
	}
	public int findTaxAmount() {
		if(super.getItemCost()>0 && GST>0) {
			this.taxAmount=(super.getItemCost()*(this.getGST()/100));
			super.setTotalCost(super.getItemCost()+this.getTaxAmount());
			return 1;
		}
		else {
			return-1;
		}
		
	}
	

}

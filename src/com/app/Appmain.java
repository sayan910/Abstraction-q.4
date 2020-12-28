package com.app;
import java.util.Scanner;

import com.model.TaxableItem;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Item Name:");
		String itemName=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the Item Cost:");
		float itemCost=sc.nextFloat();
		System.out.println("Enter the Gst:");
		float gST=sc.nextFloat();
		sc.nextLine();
		
		float totalCost=0;
		float taxAmount=0;
		TaxableItem taxableitem=new TaxableItem(itemName,itemCost, totalCost, gST, taxAmount);
		int tax=taxableitem.findTaxAmount();
		if(tax==1)
			System.out.println("totalCost."+taxableitem.getTotalCost());
		else
			System.out.println("=1");
	}

}

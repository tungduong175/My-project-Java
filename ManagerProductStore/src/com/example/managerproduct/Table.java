package com.example.managerproduct;

import java.util.HashMap;

public class Table  extends Product{

	private HashMap<String, Product> hsTable = new HashMap<>();
	static String[] idTable = new String [] {"No.01", "No.02", "No.03", "No.04", "No.05"};
	
	public Table() {
		for (int i = 0; i < idTable.length; i++) {
			hsTable.put(idTable[i], new Product());
		}
	}
	

	public HashMap<String, Product> getHsTable() {
		return hsTable;
	}

	public void addProduct(String idTable, String productName, int productQuantity) {
		hsTable.get(idTable).addProduct(productName, productQuantity);
//		hsTable.put(idTable, hsTable.get(idTable).addProduct(productName, productQuantity));
	}

}


package Groupit.model;

import java.util.ArrayList;

public class Category {
	private int Category_id;
	private String C_Name;
	public Category(String c_Name,int category_id) {
		super();
		Category_id = category_id;
		C_Name = c_Name;
	}
	public int getCategory_id() {
		return Category_id;
	}
	public void setCategory_id(int category_id) {
		Category_id = category_id;
	}
	public String getC_Name() {
		return C_Name;
	}
	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}
	public static ArrayList<Category> Categories(){
		ArrayList<Category> Categories = new ArrayList<Category>();
		Categories.add(new Category("Women's Fashion",1));
		Categories.add(new Category("Men's Fashion",2));
		Categories.add(new Category("Phones",3));
		Categories.add(new Category("Computes,Office & Security",4));
		Categories.add(new Category("Electronics",5));
		Categories.add(new Category("Jewelry & Watches",6));
		Categories.add(new Category("Home ,Pet & Appliances",7));
		Categories.add(new Category("Bags & Shoes",8));
		Categories.add(new Category("Toys ,Kids & Babies",9));
		Categories.add(new Category("Outdoor Fun & Sports",10));
		Categories.add(new Category("Beauty,Health & Hair",11));
		Categories.add(new Category("Automobiles & Motorcycles",12));
		Categories.add(new Category("Others",13));
		
		return Categories;
	}
	
}

package Groupit.model;

import java.io.InputStream;
import java.sql.Blob;




public class Product {

private int Product_id;
private String P_name;
private String P_Description;
private String C_Name;
private String P_Entry_Date;
private int Category_id;
private int P_Quantity;
private InputStream P_Image;
private float P_UnitPrice ;
private int User_id;
private Blob blob;



public Product() {
	Product_id = 0;
	P_name = null;
	P_Description = null;
	P_Entry_Date = null;
	Category_id = 0;
	P_Quantity = 0;
	P_Image = null;
	P_UnitPrice = 0;
	User_id = 0;
	C_Name= null;
	this.blob = null;
}
public String getP_name() {
	return P_name;
}
public void setP_name(String p_name) {
	P_name = p_name;
}
public String getP_Description() {
	return P_Description;
}
public void setP_Description(String p_Description) {
	P_Description = p_Description;
}
public String getP_Entry_Date() {
	return P_Entry_Date;
}
public void setP_Entry_Date(String p_Entry_Date) {
	P_Entry_Date = p_Entry_Date;
}

public int getCategory_id() {
	return Category_id;
}
public void setCategory_id(int category_id) {
	Category_id = category_id;
}

public int getUser_id() {
	return User_id;
}
public void setUser_id(int user_id) {
	User_id = user_id;
}
public int getP_Quantity() {
	return P_Quantity;
}
public void setP_Quantity(int p_Quantity) {
	P_Quantity = p_Quantity;
}
public InputStream getP_Image() {
	return P_Image;
}
public void setP_Image(InputStream p_Image) {
	P_Image = p_Image;
}
public float getP_UnitPrice() {
	return P_UnitPrice;
}
public void setP_UnitPrice(float p_UnitPrice) {
	P_UnitPrice = p_UnitPrice;
}
public Blob getBlob() {
	return blob;
}
public void setBlob(Blob blob) {
	this.blob = blob;
}
public int getProduct_id() {
	return Product_id;
}
public void setProduct_id(int product_id) {
	Product_id = product_id;
}
public String getC_Name() {
	return C_Name;
}
public void setC_Name(String c_Name) {
	C_Name = c_Name;
}


}

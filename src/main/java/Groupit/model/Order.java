package Groupit.model;

public class Order {
private int order_id;
private int Product_id;
private String P_name;
private Float Unit_Price ;
private int Qunatity ;
private Float Price;
private String Date ;


public int getProduct_id() {
	return Product_id;
}
public void setProduct_id(int p_id) {
	Product_id = p_id;
}
public String getP_name() {
	return P_name;
}
public void setP_name(String p_name) {
	P_name = p_name;
}
public Float getUnit_Price() {
	return Unit_Price;
}
public void setUnit_Price(Float unit_Price) {
	Unit_Price = unit_Price;
}
public int getQunatity() {
	return Qunatity;
}
public void setQunatity(int qunatity) {
	Qunatity = qunatity;
}
public Float getPrice() {
	return Price;
}
public void setPrice(Float price) {
	Price = price;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}

}

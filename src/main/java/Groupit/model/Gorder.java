package Groupit.model;

public class Gorder {
	private int order_id;
	private String Order_Date;
	private String Order_Statue;
	private int Groupe_id ;
	private Float Price;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_Date() {
		return Order_Date;
	}
	public void setOrder_Date(String order_Date) {
		Order_Date = order_Date;
	}
	public String getOrder_Statue() {
		return Order_Statue;
	}
	public void setOrder_Statue(String order_Statue) {
		Order_Statue = order_Statue;
	}
	public int getGroupe_id() {
		return Groupe_id;
	}
	public void setGroupe_id(int groupe_id) {
		Groupe_id = groupe_id;
	}
	public Float getPrice() {
		return Price;
	}
	public void setPrice(Float price) {
		Price = price;
	}

}

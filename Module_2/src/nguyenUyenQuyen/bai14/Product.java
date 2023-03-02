package nguyenUyenQuyen.bai14;

import java.text.DecimalFormat;

public class Product {
	private String description, productID;
	private double price;
	/**
	 * 
	 */
	public Product() {
		description = "Chưa có mô tả";
		productID = "không có";
		price = 0;
	}
	/**
	 * @param description
	 * @param productID
	 * @param price
	 */
	public Product(String description, String productID, double price) {
		setDescription(description);
		setProductID(productID);
		setPrice(price);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if(!description.trim().equals(""))
			this.description = description;
		else
			description = "Chưa có mô tả";
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		if(!productID.trim().equals(""))
			this.productID = productID;
		else
			productID = "Không có";
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price >= 0)
			this.price = price;
		else
			price = 0;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%10s | %20s | %15s", description, productID , df.format(price));
	}
	
	
	
	
	
	

}

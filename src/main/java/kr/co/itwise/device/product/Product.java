package kr.co.itwise.device.product;

public class Product {
	private String title;
	private String description;
	private String imgPath;
	private int totalStock;
	private Number price;	
	
	public Product(){
		
	}
	
	public Product(String title, String description, String imgPath,
			int totalStock, Number price) {
		super();
		this.title = title;
		this.description = description;
		this.imgPath = imgPath;
		this.totalStock = totalStock;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public int getTotalStock() {
		return totalStock;
	}
	public void setTotalStock(int totalStock) {
		this.totalStock = totalStock;
	}
	public Number getPrice() {
		return price;
	}
	public void setPrice(Number price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [title=" + title + ", description=" + description
				+ ", imgPath=" + imgPath + ", totalStock=" + totalStock
				+ ", price=" + price + "]";
	}
	
	
}

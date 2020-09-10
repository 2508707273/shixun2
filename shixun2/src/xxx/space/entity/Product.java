package xxx.space.entity;

import java.util.Date;

public class Product {
	private int id;
	private String name;
	private int Cate_id;
	private String thumbnail;
	private int inventory;
	private int sales_volume;
	private double price;
	private double sale_price;
	private String detail_description;
	private String selling_description;
	private Date create_time;
	private Date sale_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCate_id() {
		return Cate_id;
	}
	public void setCate_id(int cate_id) {
		Cate_id = cate_id;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public int getSales_volume() {
		return sales_volume;
	}
	public void setSales_volume(int sales_volume) {
		this.sales_volume = sales_volume;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSale_price() {
		return sale_price;
	}
	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}
	public String getDetail_description() {
		return detail_description;
	}
	public void setDetail_description(String detail_description) {
		this.detail_description = detail_description;
	}
	public String getSelling_description() {
		return selling_description;
	}
	public void setSelling_description(String selling_description) {
		this.selling_description = selling_description;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getSale_time() {
		return sale_time;
	}
	public void setSale_time(Date sale_time) {
		this.sale_time = sale_time;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, int cate_id, String thumbnail, int inventory, int sales_volume, double price,
			double sale_price, String detail_description, String selling_description, Date create_time,
			Date sale_time) {
		super();
		this.id = id;
		this.name = name;
		Cate_id = cate_id;
		this.thumbnail = thumbnail;
		this.inventory = inventory;
		this.sales_volume = sales_volume;
		this.price = price;
		this.sale_price = sale_price;
		this.detail_description = detail_description;
		this.selling_description = selling_description;
		this.create_time = create_time;
		this.sale_time = sale_time;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Cate_id=" + Cate_id + ", thumbnail=" + thumbnail
				+ ", inventory=" + inventory + ", sales_volume=" + sales_volume + ", price=" + price + ", sale_price="
				+ sale_price + ", detail_description=" + detail_description + ", selling_description="
				+ selling_description + ", create_time=" + create_time + ", sale_time=" + sale_time + "]";
	}
}

package main;

public class Product {

	private int id;
	private boolean medicine;
	private String description;
	private String laboratory;
	private float price;

	public Product(int id, boolean medicine, String description, String laboratory, float price) {
		super();
		this.id = id;
		this.medicine = medicine;
		this.description = description;
		this.laboratory = laboratory;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isMedicine() {
		return medicine;
	}

	public void setMedicine(boolean medicine) {
		this.medicine = medicine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLaboratory() {
		return laboratory;
	}

	public void setLaboratory(String laboratory) {
		this.laboratory = laboratory;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

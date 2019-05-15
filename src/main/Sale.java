package main;
import main.Product;
import main.Employee;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Sale {

	private int ticket;
	private LocalDateTime date;
	private float total;
	private String paymentType;
	private List<Product> lstProducts;
	private List<Employee> lstCashier;
	private List<Employee> lstSeller;

	public Sale(int ticket, LocalDateTime date, float total, String paymentType, List<Product> lstProducts,
			List<Employee> lstCashier, List<Employee> lstSeller) {
		super();
		this.ticket = ticket;
		this.date = date;
		this.total = total;
		this.paymentType = paymentType;
		this.lstProducts = new ArrayList<Product>();
		this.lstCashier = new ArrayList<Employee>();
		this.lstSeller = new ArrayList<Employee>();
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public List<Product> getLstProducts() {
		return lstProducts;
	}

	public void setLstProducts(List<Product> lstProducts) {
		this.lstProducts = lstProducts;
	}

	public List<Employee> getLstCashier() {
		return lstCashier;
	}

	public void setLstCashier(List<Employee> lstCashier) {
		this.lstCashier = lstCashier;
	}

	public List<Employee> getLstSeller() {
		return lstSeller;
	}

	public void setLstSeller(List<Employee> lstSeller) {
		this.lstSeller = lstSeller;
	}

}

package main;
import main.Address;
import java.util.ArrayList;
import java.util.List;

public class Office {
	
	private int salePoint;
	private Address address;
	private List<Employee> lstEmployee;
	
	public Office(int salePoint, Address address, List<Employee> lstEmployee) {
		super();
		this.salePoint = salePoint;
		this.address = address;
		this.lstEmployee = new ArrayList<Employee>();;
	}
	
	public int getSalePoint() {
		return salePoint;
	}
	public void setSalePoint(int salePoint) {
		this.salePoint = salePoint;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Employee> getLstEmployee() {
		return lstEmployee;
	}
	public void setLstEmployee(List<Employee> lstEmployee) {
		this.lstEmployee = lstEmployee;
	}
	
}

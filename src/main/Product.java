package main;

public class Product {

	private boolean medicamento;
	private String descripcion;
	private String laboratorio;
	private int id;
	private float precio;
	
	public Product(boolean medicamento, String descripcion, String laboratorio, int id, float precio) {
		super();
		this.medicamento = medicamento;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.id = id;
		this.precio = precio;
	}

	public boolean isMedicamento() {
		return medicamento;
	}

	public void setMedicamento(boolean medicamento) {
		this.medicamento = medicamento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}

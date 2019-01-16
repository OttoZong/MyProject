package include;

public class Product {
	private int id;
	private String nombre;
	private String descripcion;
	private float precio;
	private String categoria;
	private String detalles;
	private String revuews;
	private int size;
	private String color;
	private String images_1;
	private String images_2;
	private String images_3;
	private String images_4;
	private String images_5;
	
	
	
	public Product() {}
	
	public Product(int id, String nombre, String descripcion, float precio, String categoria, String detalles,
			String revuews, int size, String color, String images_1, String images_2, String images_3, String images_4,
			String images_5) {
	
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
		this.detalles = detalles;
		this.revuews = revuews;
		this.size = size;
		this.color = color;
		this.images_1 = images_1;
		this.images_2 = images_2;
		this.images_3 = images_3;
		this.images_4 = images_4;
		this.images_5 = images_5;
	}


	public String getRevuews() {
		return revuews;
	}


	public void setRevuews(String revuews) {
		this.revuews = revuews;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getDetalles() {
		return detalles;
	}


	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getImages_1() {
		return images_1;
	}


	public void setImages_1(String images_1) {
		this.images_1 = images_1;
	}


	public String getImages_2() {
		return images_2;
	}


	public void setImages_2(String images_2) {
		this.images_2 = images_2;
	}


	public String getImages_3() {
		return images_3;
	}


	public void setImages_3(String images_3) {
		this.images_3 = images_3;
	}


	public String getImages_4() {
		return images_4;
	}


	public void setImages_4(String images_4) {
		this.images_4 = images_4;
	}


	public String getImages_5() {
		return images_5;
	}


	public void setImages_5(String images_5) {
		this.images_5 = images_5;
	}
	
	
	
}

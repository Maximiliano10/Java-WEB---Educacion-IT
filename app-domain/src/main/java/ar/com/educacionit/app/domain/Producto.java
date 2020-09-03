package ar.com.educacionit.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "precion")
	private Float precio;
	
	@Column(name = "codigo", unique = true)
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name = "tipo_producto", referencedColumnName = "id")
	private Long tipoProducto;
	
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	public Producto(Long id, String titulo, Float precio, Long tipoProducto) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.tipoProducto = tipoProducto;
	}
	
	
	public Producto(String titulo, Float precio, Long tipoProducto) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		this.tipoProducto = tipoProducto;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Long getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(Long tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
}

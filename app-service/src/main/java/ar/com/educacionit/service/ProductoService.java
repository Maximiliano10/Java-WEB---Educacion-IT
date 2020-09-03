package ar.com.educacionit.service;

import java.util.List;
import ar.com.educacionit.*;

public interface ProductoService {

	/**
	 * Obtiene todos los producot de la db
	 * @return
	 */
	public List<Producto> findAll();
	
	public Producto getById(Long idProducto);
	
	public Producto getByCodigo(String codigo);
	
	public Producto deleteProductoById(Long id);
	
	public Producto updateProducto(Long id)
}

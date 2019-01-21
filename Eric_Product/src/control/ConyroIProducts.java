package control;

import include.Product;
import model.ModelProducts;

public class ConyroIProducts {
	
	//新增.
	public boolean createProducto(Product p){
		ModelProducts modelp = new ModelProducts();
		return modelp.create_Product(p);
	}
}

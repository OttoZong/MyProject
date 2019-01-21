package control;

import include.Product;
import model.Model;

public class Controller {

	public boolean createProducto(Product p){
		Model model = new Model();
		return model.create_list(p);
	}
}

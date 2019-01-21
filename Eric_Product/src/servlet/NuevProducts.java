package servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import control.ConyroIProducts;
import include.Product;


@WebServlet("/nuevproducts")
public class NuevProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public NuevProducts() {
        super();        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		FileItemFactory file_factory = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(file_factory);
		
		ArrayList<String> campos = new ArrayList<>();
		ArrayList<String> image = new ArrayList<>();
		
		try {
			List items = sfu.parseRequest(request);
			for(int i=0;i<items.size();i++){
				FileItem item =(FileItem)items.get(i);
				if(!item.isFormField()){
					File atchio = 
							new File("D:\\tts9\\workspace\\Eric_Product"+item.getName());
					item.write(atchio);
					image.add("img/products/"+item.getName());
				}else{
					campos.add(item.getString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Product p = new Product();
		ConyroIProducts cp = new ConyroIProducts();
		response.getWriter().println("");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

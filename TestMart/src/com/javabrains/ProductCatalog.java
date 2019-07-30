package com.javabrains;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductCatalog {
	
		ProductServiceImpl productService= new ProductServiceImpl();
		
	@WebMethod
	   public List<String> getProductCatergories(){
			return productService.getProductCatergories();
	}

	   public List<String> getProducts(String category){
		   return productService.getProducts(category);
	}

}

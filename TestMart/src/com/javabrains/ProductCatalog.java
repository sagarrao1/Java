package com.javabrains;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.javabrains.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	
	ProductServiceImpl productService= new ProductServiceImpl();
		
	@WebMethod
	 public List<String> getProductCatergories(){
			return productService.getProductCatergories();
	} 

	@WebMethod
	 public List<String> getProducts(String category){
		   return productService.getProducts(category);
	}

	@WebMethod
	 public boolean addProduct(String category,String product){
		   return productService.addProduct(category, product);
	}


}

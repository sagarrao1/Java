package com.javabrains;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.javabrains.model.Product;

@WebService(name = "TestMartCatalog", serviceName = "TestMartCatalogService", portName = "TestMartCatalogPort", 
						targetNamespace = "http://www.TestMart.com")
public interface ProductCatalogInterface {

	@WebMethod(action = "fetch_categories" ,operationName ="fetchCategories" )
	List<String> getProductCatergories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);
	
	@WebMethod
	List<Product> getProductsV2(String category);

}
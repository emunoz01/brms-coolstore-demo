package com.redhat.coolstore.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Singleton;

import com.redhat.coolstore.model.Product;

@Singleton
public class ProductService {

	private List<Product> products;
	
	public ProductService() {
		
		products = new ArrayList<Product>();
		
		products.add(new Product("329299", "Plan 3", "Desc. Plan 3", 56.88));
		products.add(new Product("329199", "Plan 3D", "Desc. Plan 3D", 36.88));
		products.add(new Product("165613", "Plan 4", "Desc. Plan 4", 70.40));
		products.add(new Product("165614", "Plan 4D", "Desc. Plan 4D", 51.07));
		products.add(new Product("165954", "Plan 5", "Desc. Plan 5D", 82.67));
		
	}
	
	public List<Product> getProducts() {
		
		return new ArrayList<Product>(products);
		
	}
	
	public void setProducts(List<Product> products) {
		
		if ( products != null ) {
		
			this.products = new ArrayList<Product>(products);
			
		} else {
			
			this.products = new ArrayList<Product>();
		}		
		
	}
	
	public Map<String, Product> getProductMap() {
		
		Map<String, Product> productMap = new HashMap<String, Product>();
		
		for (Product p : getProducts()) {
			
			productMap.put(p.getItemId(), p);
			
		}
		
		return productMap;
		
	}
	
	
}

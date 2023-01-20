package com.productManagement.service;

import java.util.List;

import com.productManagement.model.Product;
import org.springframework.data.domain.Page;

public interface ProductService {


	List<Product> getAllProducts();


	void saveProduct(Product product);


	Product getProductById(long id);


	void deleteProductById(long id);


	Page<Product> findPaginated(int pageNo, int pageSize);


}

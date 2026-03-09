package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public void saveProducts(Product product){
         productRepository.save(product);
    }
    public Product getProductById(Integer id){
        return productRepository.findById(id).orElse(null);
    }
    public void deleteProduct(Integer id){
         productRepository.deleteById(id);
    }
}

package net.productmanager.service;

import net.productmanager.model.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    void updateProduct(Product product);

    void removeProduct(int id);

    Product getProductById(int id);

    List<Product> listProducts();
}

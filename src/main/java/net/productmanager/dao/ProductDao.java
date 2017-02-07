package net.productmanager.dao;

import net.productmanager.model.Product;

import java.util.List;

public interface ProductDao {
    void addProduct(Product product);

    void updateProduct(Product product);

    void removeProduct(int id);

    Product getProductById(int id);

    List<Product> listProducts();

}

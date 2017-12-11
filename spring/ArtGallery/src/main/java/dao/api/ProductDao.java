package dao.api;

import dao.entity.Product;

import java.util.List;

public interface ProductDao {


    public List<Product> getProducts();
    public String addProduct(Product product);
    public int deleteProductById(int id);
    public List<Product> searchProductsBySearchText(String searchText);

}

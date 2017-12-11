package dao.impl;

import dao.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ProductDaoImpl")

public class ProductDao implements dao.api.ProductDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> getProducts() {
        String sql="select * from Product";
        List<Product> productList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Product.class));

        return productList;
    }

    @Override
    public String addProduct(Product product) {
        return null;
    }

    @Override
    public int deleteProductById(int id) {
        return 0;
    }

    @Override
    public List<Product> searchProductsBySearchText(String searchText) {
        String sql="select pid,name,description,price from Product where name like ? or description like?";
        Object data[]=new Object[]{"%"+searchText+"%","%"+searchText+"%"};
        List<Product> productList=jdbcTemplate.query(sql,data,new BeanPropertyRowMapper<>(Product.class));
        return null;
    }
}

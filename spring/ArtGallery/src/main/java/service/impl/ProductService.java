package service.impl;


import dao.entity.Product;
import dao.impl.ProductDao;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.data.ProductData;

import java.util.ArrayList;
import java.util.List;

@Service("ProductServiceImpl")
public class ProductService implements service.api.ProductService {

    @Autowired
    @Qualifier("ProductDaoImpl")
    private ProductDao productDao;

    @Override
    public List<ProductData> getProducts() {
        List<Product> productList=productDao.getProducts();
        List<ProductData> products=new ArrayList<>();
        if(productList!=null){
            for(dao.entity.Product product:productList){
                ProductData product1=new ProductData();
                BeanUtils.copyProperties(product,product1);
                products.add(product1);
            }
        }

        return products;
    }
}

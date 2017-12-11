package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.api.ProductService;
import service.data.ProductData;


@Controller
public class ProductController {

    @Autowired
    @Qualifier("ProductServiceImpl")
    private ProductService productService;

    @RequestMapping(value = "/productGet",method= RequestMethod.GET,produces = {"application/json"})
    @ResponseBody public ProductData getProducts(){
        ProductData product =new ProductData();
        product.setName("Table");
        product.setDescription("Wooden Chair");
        product.setPrice(50);
        product.setImage("Not available");
        return product;
    }


    @RequestMapping(value = "/Allproducts",method= RequestMethod.GET)
    @ResponseBody public ProductData getProductsAll(){
        ProductData product =new ProductData();
        productService.getProducts();
        return product;
    }

}

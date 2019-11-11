package pers.henglin.demo.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pres.henglin.core.entity.Product;

import java.util.List;

/**
 * Created by linheng on 11/11/2019.
 */

@RestController
public class ProductController {
    private String REST_URL_PREFIX = "http://DEMO-SERVER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/product")
    public boolean create(Product product){
        return restTemplate.postForObject(REST_URL_PREFIX + "/products", product, Boolean.class);
    }

    @RequestMapping(value="/product/{id}")
    public Product read(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/" + id, Product.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/products")
    public List<Product> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/products", List.class);
    }
}

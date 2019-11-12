package pers.henglin.demo.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pres.henglin.core.entity.Product;
import pres.henglin.core.service.ProductClientService;

import java.util.List;

/**
 * Created by linheng on 11/11/2019.
 */

@RestController
public class ProductController {

    @Autowired
    private ProductClientService service;

    @RequestMapping(value="/product")
    public boolean create(Product product){
        return this.service.create(product);
    }

    @RequestMapping(value="/product/{id}")
    public Product read(@PathVariable("id") Long id){
        return this.service.read(id);
    }

    @RequestMapping(value="/products")
    public List<Product> list(){
        return this.service.list();
    }
}

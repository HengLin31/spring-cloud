package pers.henglin.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.henglin.demo.service.ProductService;
import pres.henglin.core.entity.Product;

import java.util.List;

/**
 * Created by linheng on 09/11/2019.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping(value="/product", method=RequestMethod.POST)
    public boolean create(@RequestBody Product product){
        return service.create(product);
    }

    @RequestMapping(value="/product/{id}", method=RequestMethod.GET)
    public Product read(@PathVariable("id") Long id){
        return service.read(id);
    }

    @RequestMapping(value="/products", method=RequestMethod.GET)
    public List<Product> list(){
        return service.list();
    }
}

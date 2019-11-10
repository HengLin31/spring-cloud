package pers.henglin.demo.service;

import pres.henglin.core.entity.Product;

import java.util.List;

/**
 * Created by linheng on 09/11/2019.
 */
public interface ProductService {
    public boolean create(Product product);
    public Product read(Long id);
    public List<Product> list();
}

package pers.henglin.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import pers.henglin.demo.mapper.ProductMapper;
import pers.henglin.demo.service.ProductService;
import pres.henglin.core.entity.Product;

import java.util.List;

/**
 * Created by linheng on 09/11/2019.
 */

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper mapper;

    @Override
    public boolean create(Product product) {
        return mapper.create(product);
    }

    @Override
    public Product read(Long id) {
        return mapper.read(id);
    }

    @Override
    public List<Product> list() {
        return mapper.findAll();
    }
}

package pres.henglin.core.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pres.henglin.core.entity.Product;

import java.util.List;

/**
 * Created by linheng on 12/11/2019.
 */

@FeignClient(value = "DEMO-SERVER")
public interface ProductClientService {

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public boolean create(Product  product);

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product read(@PathVariable("id") Long id);

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> list();
}

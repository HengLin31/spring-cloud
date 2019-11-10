package pers.henglin.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import pres.henglin.core.entity.Product;

import java.util.List;

/**
 * Created by linheng on 09/11/2019.
 */
@Mapper
public interface ProductMapper {

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into product(name, description) values(#{name}, #{description})")
    public boolean create(Product product);

    @Select("select * from product where id=#{id}")
    public Product read(Long id);

    @Select("select * from product")
    public List<Product> findAll();
}

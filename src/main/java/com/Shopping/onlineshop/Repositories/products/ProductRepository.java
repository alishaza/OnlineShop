package com.Shopping.onlineshop.Repositories.products;

import com.Shopping.onlineshop.Repositories.GenericRepository;
import com.Shopping.onlineshop.entities.products.Product;
import com.Shopping.onlineshop.entities.site.Nav;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends GenericRepository<Product> {

    @Query("from Product where category.id = :category_id")
    List<Product> findAllByCategory(long category_id);

    @Query("from Product where enable = true  and (title like concat('%' , :text,'%') and description like concat('%',:text,'%') )")
    List<Product> findAllByEnableIsTrueAndTitleContainsOrDescriptionContains(String text);
}

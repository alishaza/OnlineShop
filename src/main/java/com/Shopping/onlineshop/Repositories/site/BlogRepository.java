package com.Shopping.onlineshop.Repositories.site;

import com.Shopping.onlineshop.Repositories.GenericRepository;
import com.Shopping.onlineshop.entities.site.Blog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends GenericRepository<Blog> {

    @Query("from Blog where enable = true and title like concat('%' , :text , '%') and description like concat('%',:text,'%') ")
    Blog findAllByEnableIsTrueAndTitleContainsOrDescriptionNotContains(String text);
    List<Blog> findAllByEnableIsTrue();


}

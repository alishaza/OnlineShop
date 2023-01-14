package com.Shopping.onlineshop.Repositories.site;

import com.Shopping.onlineshop.entities.site.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends CrudRepository<Blog , Long> {

    List<Blog> findAllByEnableIsTrueAndTitleContainsOrDescriptionNotContains(String text);
    List<Blog> findAllByEnableIsTrue();
}

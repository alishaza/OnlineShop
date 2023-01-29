package com.Shopping.onlineshop.controller.site;

import com.Shopping.onlineshop.Repositories.Generics.GenericRepository;
import com.Shopping.onlineshop.controller.Generics.GenericController;
import com.Shopping.onlineshop.entities.site.Blog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/blog")
public class BlogController extends GenericController<Blog> {
   public BlogController(GenericRepository<Blog> repository) {
        super(repository);
   }


}

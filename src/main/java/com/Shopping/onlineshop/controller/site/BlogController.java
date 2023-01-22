package com.Shopping.onlineshop.controller.site;

import com.Shopping.onlineshop.Repositories.GenericRepository;
import com.Shopping.onlineshop.controller.GenericController;
import com.Shopping.onlineshop.entities.site.Blog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/blog")
public class BlogController extends GenericController<Blog> {



   public BlogController(GenericRepository<Blog> repository) {
        super(repository);
   }

    @GetMapping("/a")
    public ResponseEntity<String> getOne(){
        return ResponseEntity.ok("a");
    }
}

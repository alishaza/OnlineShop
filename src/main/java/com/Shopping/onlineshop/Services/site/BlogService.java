package com.Shopping.onlineshop.Services.site;

import com.Shopping.onlineshop.Repositories.site.BlogRepository;
import com.Shopping.onlineshop.entities.site.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> showBlogs()
    {
       return  blogRepository.findAllByEnableIsTrue();
    }


    public List<Blog> searchBlogs(String text)
    {
        return  blogRepository.findAllByEnableIsTrueAndTitleContainsOrDescriptionNotContains(text);
    }

    public Blog addBlog(Blog blog){
       return blogRepository.save(blog);
    }







}

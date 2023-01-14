package com.Shopping.onlineshop.Services.site;

import com.Shopping.onlineshop.Repositories.site.BlogRepository;
import com.Shopping.onlineshop.Repositories.site.BlogRepository;
import com.Shopping.onlineshop.entities.site.Blog;
import com.Shopping.onlineshop.entities.site.Blog;
import com.Shopping.onlineshop.entities.site.Nav;
import com.Shopping.onlineshop.exceptions.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepository BlogRepository;
    public Blog getById(long id ){
        var data = BlogRepository.findById(id);
        if (data.isPresent()) return data.get();
        return null;
    }
    public Blog search(String keyword){
        var data = BlogRepository.findAllByEnableIsTrueAndTitleContainsOrDescriptionNotContains(keyword);
        if (data != null) return data;
        return null;
    }
    public Blog addBlog(Blog Blog){
        return BlogRepository.save(Blog);
    }

    public Blog updateُBlog(Blog Blog) throws DataNotFoundException {
        var oldBlog = getById(Blog.getId());

        if ( Blog == null)
            throw new DataNotFoundException("data with id "+Blog.getId()+" is not found ");

        oldBlog.setImage(oldBlog.getImage());
        oldBlog.setTitle(oldBlog.getTitle());
        oldBlog.setEnable(oldBlog.isEnable());
        oldBlog.setDescription(oldBlog.getDescription());
        oldBlog.setSubtitle(oldBlog.getSubtitle());
        return BlogRepository.save(oldBlog);
    }

    public void increaseVisitCount(Blog blog)
    {
        blog.setVisitcount(blog.getVisitcount());
        BlogRepository.save(blog);
    }
    public boolean deleteById(long id) throws DataNotFoundException {
        var oldData = getById(id);
        if (oldData == null)
            throw  new DataNotFoundException("data with id "+id+" is not found ");
        BlogRepository.deleteById(id);
        return true;
    }





}

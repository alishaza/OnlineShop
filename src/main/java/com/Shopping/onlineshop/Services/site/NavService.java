package com.Shopping.onlineshop.Services.site;

import com.Shopping.onlineshop.Repositories.site.NavRepository;
import com.Shopping.onlineshop.Repositories.site.NavRepository;
import com.Shopping.onlineshop.entities.site.Nav;
import com.Shopping.onlineshop.entities.site.Nav;
import com.Shopping.onlineshop.exceptions.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavService {
    @Autowired
    private NavRepository navRepository;

    public Nav getById(long id ){
        var data = navRepository.findById(id);
        if (data.isPresent()) return data.get();
        return null;
    }
    public Nav addNav(Nav nav){
        return navRepository.save(nav);
    }

    public Nav updateBlog(Nav nav) throws DataNotFoundException {
        var oldNav = getById(nav.getId());
        if ( oldNav == null)
            throw new DataNotFoundException("data with id "+nav.getId()+" is not found ");

        oldNav.setLink(oldNav.getLink());
        oldNav.setTitle(oldNav.getTitle());
        oldNav.setEnable(oldNav.isEnable());
        return navRepository.save(oldNav);
    }

    public boolean deleteById(long id) throws DataNotFoundException {
        var oldData = getById(id);
        if (oldData == null)
            throw  new DataNotFoundException("data with id "+id+" is not found ");
        navRepository.deleteById(id);
        return true;
    }


}

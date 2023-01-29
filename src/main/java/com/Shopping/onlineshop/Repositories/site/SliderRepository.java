package com.Shopping.onlineshop.Repositories.site;

import com.Shopping.onlineshop.Repositories.Generics.GenericRepository;
import com.Shopping.onlineshop.entities.site.Slider;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SliderRepository extends GenericRepository<Slider> {

    public List<Slider> findAllByEnableIsTrue(Sort sort);
}

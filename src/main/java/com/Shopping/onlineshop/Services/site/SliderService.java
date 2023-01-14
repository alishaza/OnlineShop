package com.Shopping.onlineshop.Services.site;

import com.Shopping.onlineshop.Repositories.site.BlogRepository;
import com.Shopping.onlineshop.Repositories.site.SliderRepository;
import com.Shopping.onlineshop.entities.site.Slider;
import com.Shopping.onlineshop.exceptions.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SliderService {
    @Autowired
    private SliderRepository sliderRepository;

    public Slider getById(long id ){
        var data = sliderRepository.findById(id);
        if (data.isPresent()) return data.get();
        return null;
    }
    public Slider addSlider(Slider slider){
        return sliderRepository.save(slider);
    }

    public Slider updateُSlider(Slider slider) throws DataNotFoundException {
        if ( slider == null)
            throw new DataNotFoundException("data with id "+slider.getId()+" is not found ");

        var oldSlider = getById(slider.getId());
        oldSlider.setLink(oldSlider.getLink());
        oldSlider.setItemOrder( oldSlider.getItemOrder());
        oldSlider.setImage( oldSlider.getImage());
        oldSlider.setTitle(oldSlider.getTitle());
        oldSlider.setDescription(oldSlider.getDescription());
        oldSlider.setEnable(oldSlider.isEnable());
        return sliderRepository.save(oldSlider);
    }

    public boolean deleteById(long id) throws DataNotFoundException {
        Slider oldData = getById(id);
        if (oldData == null)
            throw  new DataNotFoundException("data with id "+id+" is not found ");
        sliderRepository.deleteById(id);
        return true;
    }


}

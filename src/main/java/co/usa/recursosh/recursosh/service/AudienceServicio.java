package co.usa.recursosh.recursosh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursosh.recursosh.model.Audience;
import co.usa.recursosh.recursosh.repository.AudienceRepositorio;

@Service
public class AudienceServicio {

    @Autowired
    private AudienceRepositorio audienceRepositorio;

    public List<Audience>getAll(){
        return audienceRepositorio.getAll();      
    }

    public Optional<Audience>getAudience(int id){
        return audienceRepositorio.getAudience(id);
    }

    public Audience save(Audience audience){
        if (audience.getId()==null) {
            return audienceRepositorio.save(audience);

        } else{
            Optional<Audience> consulta=audienceRepositorio.getAudience(audience.getId());
            if (consulta.isEmpty()) {
                return audienceRepositorio.save(audience);

                
            } else {
                return audience;
            }

            
        }



    }




    
}

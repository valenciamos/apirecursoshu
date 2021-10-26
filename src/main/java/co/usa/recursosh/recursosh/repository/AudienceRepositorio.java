package co.usa.recursosh.recursosh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursosh.recursosh.model.Audience;
import co.usa.recursosh.recursosh.repository.crud.AudienceCrudRepositorio;



@Repository
public class AudienceRepositorio {
    @Autowired
    private AudienceCrudRepositorio audienceCrudRepositorio;

    public List<Audience> getAll(){
        return (List<Audience>)audienceCrudRepositorio.findAll();       
    }

    public Optional<Audience>getAudience(int id){
        return audienceCrudRepositorio.findById(id);
    }

    public Audience save(Audience audience){
        return audienceCrudRepositorio.save(audience);
    }
        
}
   

    


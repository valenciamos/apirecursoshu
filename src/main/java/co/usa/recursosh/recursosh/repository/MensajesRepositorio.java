package co.usa.recursosh.recursosh.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursosh.recursosh.model.Mensajes;
import co.usa.recursosh.recursosh.repository.crud.MensajesCrudRepositorio;

@Repository
public class MensajesRepositorio {
    @Autowired

    private MensajesCrudRepositorio mensajesCrudRepositorio;

    public List<Mensajes> getAll(){
        return (List<Mensajes>)mensajesCrudRepositorio.findAll();       
    }

    public Optional<Mensajes>getMensajes(int id){
        return mensajesCrudRepositorio.findById(id);
    }

    public Mensajes save(Mensajes mensaje){
        return mensajesCrudRepositorio.save(mensaje);
        
    }


        
}
   
    
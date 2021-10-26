package co.usa.recursosh.recursosh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursosh.recursosh.model.Mensajes;
import co.usa.recursosh.recursosh.repository.MensajesRepositorio;

@Service

public class MensajesServicio {
    @Autowired
    MensajesRepositorio mensajesRepositorio;

    public List<Mensajes>getAll(){
        return mensajesRepositorio.getAll();                
    }

    public Optional<Mensajes>getMensajes(int id){
        return mensajesRepositorio.getMensajes(id);                
    }

    public Mensajes save(Mensajes men){
        // verificar si el id es nulo

        if (men.getIdMessage()==null){
            return mensajesRepositorio.save(men);
        }else{// verifico si existe o no el id en la base de datos
            Optional<Mensajes> consulta=mensajesRepositorio.getMensajes(men.getIdMessage());

            if(consulta.isEmpty()){
                return mensajesRepositorio.save(men);
            
            }else{
                return men;
            }
        }
    }
}

    


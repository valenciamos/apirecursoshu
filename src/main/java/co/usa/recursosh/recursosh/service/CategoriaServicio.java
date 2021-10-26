package co.usa.recursosh.recursosh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursosh.recursosh.model.Categoria;
import co.usa.recursosh.recursosh.repository.CategoriaRepositorio;

@Service
public class CategoriaServicio {
    @Autowired
    CategoriaRepositorio categoriaRepositorio;

    public List<Categoria>getAll(){
        return categoriaRepositorio.getAll();                
    }

    public Optional<Categoria>getCategoria(int id){
        return categoriaRepositorio.getCategoria(id);                
    }

    public Categoria save(Categoria cat){
        // verificar si el id es nulo

        if (cat.getId()==null){
            return categoriaRepositorio.save(cat);
        }else{// verifico si existe o no el id en la base de datos
            Optional<Categoria> consulta=categoriaRepositorio.getCategoria(cat.getId());

            if(consulta.isEmpty()){
                return categoriaRepositorio.save(cat);
            
            }else{
                return cat;
            }
        }
    }
}


    


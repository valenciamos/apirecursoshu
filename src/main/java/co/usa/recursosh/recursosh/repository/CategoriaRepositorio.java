package co.usa.recursosh.recursosh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursosh.recursosh.model.Categoria;
import co.usa.recursosh.recursosh.repository.crud.CategoriaCrudRepositorio;


@Repository
public class CategoriaRepositorio {

   @Autowired
   private CategoriaCrudRepositorio categoriaCrudRepositorio;

   public List <Categoria>getAll(){
    return (List<Categoria>)categoriaCrudRepositorio.findAll();     
   }

   public Optional<Categoria>getCategoria(int id){
       return categoriaCrudRepositorio.findById(id);       
   }

   public Categoria save(Categoria cat){
    return categoriaCrudRepositorio.save(cat);
   }
   

    
}

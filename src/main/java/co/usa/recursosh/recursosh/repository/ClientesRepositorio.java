package co.usa.recursosh.recursosh.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursosh.recursosh.model.Clientes;
import co.usa.recursosh.recursosh.repository.crud.ClientesCrudRepositorio;


@Repository
public class ClientesRepositorio {

    @Autowired

    private ClientesCrudRepositorio clienteCrudRepositorio;

    public List<Clientes> getAll(){
        return (List<Clientes>)clienteCrudRepositorio.findAll();       
    }

    public Optional<Clientes>getCliente(int id){
        return clienteCrudRepositorio.findById(id);
    }

    public Clientes save(Clientes cliente){
        return clienteCrudRepositorio.save(cliente);
    }


        
}
   
    


package co.usa.recursosh.recursosh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursosh.recursosh.model.Clientes;
import co.usa.recursosh.recursosh.repository.ClientesRepositorio;


@Service
public class ClientesServicio {
    @Autowired
    ClientesRepositorio clienteRepositorio;

    public List<Clientes>getAll(){
        return clienteRepositorio.getAll();                
    }

    public Optional<Clientes>getCliente(int id){
        return clienteRepositorio.getCliente(id);                
    }

    public Clientes save(Clientes cli){
        // verificar si el id es nulo

        if (cli.getIdClient()==null){
            return clienteRepositorio.save(cli);
        }else{// verifico si existe o no el id en la base de datos
            Optional<Clientes> consulta=clienteRepositorio.getCliente(cli.getIdClient());

            if(consulta.isEmpty()){
                return clienteRepositorio.save(cli);
            
            }else{
                return cli;
            }
        }
    }
}


    
    


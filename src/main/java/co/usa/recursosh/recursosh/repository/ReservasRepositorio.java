package co.usa.recursosh.recursosh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursosh.recursosh.model.Reservas;

import co.usa.recursosh.recursosh.repository.crud.ReservasCrudRepositorio;

@Repository
public class ReservasRepositorio {
    @Autowired

    private ReservasCrudRepositorio reservasCrudRepositorio;

    public List<Reservas> getAll(){
        return (List<Reservas>)reservasCrudRepositorio.findAll();       
    }

    public Optional<Reservas>getReservas(int id){
        return reservasCrudRepositorio.findById(id);
    }

    public Reservas save(Reservas reservas){
        return reservasCrudRepositorio.save(reservas);
    }
        
}    


package co.usa.recursosh.recursosh.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.usa.recursosh.recursosh.model.Reservas;
import co.usa.recursosh.recursosh.service.ReservasServicio;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})


public class ReservasControlador {
    @Autowired
    private ReservasServicio reservasServicio;

    @GetMapping("/all")
    public List<Reservas>getReservases(){
        return reservasServicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Reservas>getReservas(@PathVariable("id") int id){
        return ((ReservasServicio) reservasServicio).getReservas(id);        
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservas save(@RequestBody Reservas res){
        return reservasServicio.save(res);
    }

        
}

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

import co.usa.recursosh.recursosh.model.Clientes;
import co.usa.recursosh.recursosh.service.ClientesServicio;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ClientesControlador {
    @Autowired
    private ClientesServicio clientesServicio;

    @GetMapping("/all")
    public List<Clientes>getClientes(){
        return clientesServicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Clientes>getClientes(@PathVariable("id") int id){
        return ((ClientesServicio) clientesServicio).getCliente(id);        
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Clientes save(@RequestBody Clientes cli){
        return clientesServicio.save(cli);
    }

    
}

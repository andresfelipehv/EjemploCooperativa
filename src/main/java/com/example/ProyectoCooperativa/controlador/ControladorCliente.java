package com.example.ProyectoCooperativa.controlador;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.servicios.ServicioImpCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cliente")
@Controller

public class ControladorCliente {
    @Autowired
    private ServicioImpCliente sic;

    @GetMapping
    public List<Cliente> listar(){
        return sic.listarclientes();
    }

    @PostMapping
    public Cliente insertar(@RequestBody Cliente cli){
        return sic.GuardarCliente(cli);
    }

    @PutMapping
    public Cliente actualizar(@RequestBody Cliente cli){
        return sic.actualizarClientes(cli);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Cliente cli){
        sic.eliminarClientes(cli.getDocumento());
    }


}

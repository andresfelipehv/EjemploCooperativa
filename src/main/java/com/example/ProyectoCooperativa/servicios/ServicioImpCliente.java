package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.repositorio.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioImpCliente implements ServicioCliente {
    @Autowired
    private RepositorioCliente repositorioCliente;

    @Override
    public List<Cliente> listarclientes() {
        return repositorioCliente.findAll();
    }

    @Override
    public Cliente GuardarCliente(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public Cliente consultarClientesPorId(Integer documento) {
        return repositorioCliente.findById(documento).get();
    }

    @Override
    public Cliente actualizarClientes(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public void eliminarClientes(Integer documento) {
        repositorioCliente.deleteById(documento);

    }
}

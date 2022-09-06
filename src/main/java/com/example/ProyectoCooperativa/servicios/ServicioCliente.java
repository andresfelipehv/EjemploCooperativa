package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import java.util.List;

public interface ServicioCliente {
    public List<Cliente>listarclientes();
    public Cliente GuardarCliente(Cliente cliente);
    public Cliente consultarClientesPorId(Integer documento);
    public Cliente actualizarClientes(Cliente cliente);
    public void eliminarClientes(Integer documento);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoactivistas.controller;

import com.mycompany.ecoactivistas.dao.ClienteDAO;
import com.mycompany.ecoactivistas.interfaces.IClienteDAO;
import com.mycompany.ecoactivistas.model.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author martinbl
 */
public class ClienteController {

    private final IClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO(); // instancia la implementación concreta
    }

    // Insertar un nuevo cliente con validaciones
    public boolean agregarCliente(String nombre, String direccion, String telefonos) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.err.println("El nombre del cliente no puede estar vacío.");
            return false;
        }

        if (direccion == null) direccion = "";
        if (telefonos == null) telefonos = "";

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre.trim());
        cliente.setDireccion(direccion.trim());
        cliente.setTelefonos(telefonos.trim());

        return clienteDAO.insertar(cliente);
    }

    // Obtener un cliente por ID
    public Cliente obtenerCliente(int idCliente) {
        if (idCliente <= 0) {
            System.err.println("ID de cliente inválido.");
            return null;
        }
        return clienteDAO.obtenerPorId(idCliente);
    }

    // Obtener todos los clientes
    public List<Cliente> listarClientes() {
        return clienteDAO.obtenerTodos();
    }

    // Actualizar cliente con validaciones
    public boolean actualizarCliente(int idCliente, String nombre, String direccion, String telefonos) {
        if (idCliente <= 0) {
            System.err.println("ID de cliente inválido.");
            return false;
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            System.err.println("El nombre del cliente no puede estar vacío.");
            return false;
        }
        if (direccion == null) direccion = "";
        if (telefonos == null) telefonos = "";

        Cliente cliente = new Cliente();
        cliente.setIdCliente(idCliente);
        cliente.setNombre(nombre.trim());
        cliente.setDireccion(direccion.trim());
        cliente.setTelefonos(telefonos.trim());

        return clienteDAO.actualizar(cliente);
    }

    // Eliminar cliente con validación de ID
    public boolean eliminarCliente(int idCliente) {
        if (idCliente <= 0) {
            System.err.println("ID de cliente inválido.");
            return false;
        }
        return clienteDAO.eliminar(idCliente);
    }
    
      public DefaultTableModel obtenerTablaClientes() {
        String[] columnas = {"ID", "NOMBRE", "DIRECCIÓN", "TELEFÓNO"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        List<Cliente> lista = clienteDAO.obtenerTodos();
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{c.getIdCliente(), c.getNombre(), c.getDireccion(), c.getTelefonos()});
        }
        return modelo;
    }
    
    public DefaultTableModel obtenerTablaClientesPorFiltro(String filtro) {
        String[] columnas = {"ID", "NOMBRE", "DIRECCIÓN", "TELEFÓNO"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        List<Cliente> lista = clienteDAO.obtenerTodosPorFiltro(filtro);
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{c.getIdCliente(), c.getNombre(), c.getDireccion(), c.getTelefonos()});
        }
        return modelo;
    }
    
    public DefaultTableModel obtenerTablaClientesPorFiltroModal(String filtro) {
        String[] columnas = {"ID", "NOMBRE", "TELEFÓNO"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        List<Cliente> lista = clienteDAO.obtenerTodosPorFiltro(filtro);
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{c.getIdCliente(), c.getNombre(), c.getTelefonos()});
        }
        return modelo;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ecoactivistas.interfaces;

import com.mycompany.ecoactivistas.model.Cliente;
import java.util.List;

/**
 *
 * @author martinbl
 */
public interface IClienteDAO {
    boolean insertar(Cliente cliente);
    Cliente obtenerPorId(int idCliente);
    List<Cliente> obtenerTodos();
    List<Cliente> obtenerTodosPorFiltro(String filtro);
    boolean actualizar(Cliente cliente);
    boolean eliminar(int idCliente);
}

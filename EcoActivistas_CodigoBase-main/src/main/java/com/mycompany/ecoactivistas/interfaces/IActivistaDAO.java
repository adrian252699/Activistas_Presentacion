/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ecoactivistas.interfaces;

import com.mycompany.ecoactivistas.model.Activista;
import java.util.List;

/**
 *
 * @author martinbl
 */
public interface IActivistaDAO {
    boolean insertar(Activista activista);
    Activista obtenerPorId(int idActivista);
    List<Activista> obtenerTodos();
    boolean actualizar(Activista activista);
    boolean eliminar(int idActivista);
}

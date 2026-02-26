/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoactivistas.model;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author martinbl
 */
public class Activista {
    private int idActivista;
    private String nombre;
    private String telefono;
    private Date fchIngreso;

    public Activista() {
    }

    public Activista(int idActivista, String nombre, String telefono, Date fchIngreso) {
        this.idActivista = idActivista;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fchIngreso = fchIngreso;
    }

    public int getIdActivista() {
        return idActivista;
    }

    public void setIdActivista(int idActivista) {
        this.idActivista = idActivista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFchIngreso() {
        return fchIngreso;
    }

    public void setFchIngreso(Date fchIngreso) {
        this.fchIngreso = fchIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idActivista;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.telefono);
        hash = 89 * hash + Objects.hashCode(this.fchIngreso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Activista other = (Activista) obj;
        if (this.idActivista != other.idActivista) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        return Objects.equals(this.fchIngreso, other.fchIngreso);
    }

    @Override
    public String toString() {
        return "Activista{" + "idActivista=" + idActivista + ", nombre=" + nombre + ", telefono=" + telefono + ", fchIngreso=" + fchIngreso + '}';
    }
    
}

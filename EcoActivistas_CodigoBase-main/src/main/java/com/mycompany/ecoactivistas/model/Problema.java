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
public class Problema {
    private int idProblema;
    private Date fchIni;
    private Date fchFin;
    private String estado;// pendiente, concluido, cancelado
    private String descripcion;
    private int idCliente;   // FK hacia Cliente

    public Problema() {
    }

    public Problema(int idProblema, Date fchIni, Date fchFin, String estado, int idCliente, String descripcion) {
        this.idProblema = idProblema;
        this.fchIni = fchIni;
        this.fchFin = fchFin;
        this.estado = estado;
        this.idCliente = idCliente;
        this.descripcion= descripcion;
    }

    public int getIdProblema() {
        return idProblema;
    }

    public void setIdProblema(int idProblema) {
        this.idProblema = idProblema;
    }

    public Date getFchIni() {
        return fchIni;
    }

    public void setFchIni(Date fchIni) {
        this.fchIni = fchIni;
    }

    public Date getFchFin() {
        return fchFin;
    }

    public void setFchFin(Date fchFin) {
        this.fchFin = fchFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.idProblema;
        hash = 43 * hash + Objects.hashCode(this.fchIni);
        hash = 43 * hash + Objects.hashCode(this.fchFin);
        hash = 43 * hash + Objects.hashCode(this.estado);
        hash = 43 * hash + this.idCliente;
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
        final Problema other = (Problema) obj;
        if (this.idProblema != other.idProblema) {
            return false;
        }
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.fchIni, other.fchIni)) {
            return false;
        }
        return Objects.equals(this.fchFin, other.fchFin);
    }

    @Override
    public String toString() {
        return "Problema{" + "idProblema=" + idProblema + ", fchIni=" + fchIni + ", fchFin=" + fchFin + ", estado=" + estado + ", idCliente=" + idCliente + '}';
    }
    
}

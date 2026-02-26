/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoactivistas.model;

/**
 *
 * @author martinbl
 */
public class ProblemaActivista {

    private int idProblema;   // FK hacia Problema
    private int idActivista;  // FK hacia Activista

    public ProblemaActivista() {
    }

    public ProblemaActivista(int idProblema, int idActivista) {
        this.idProblema = idProblema;
        this.idActivista = idActivista;
    }

    public int getIdProblema() {
        return idProblema;
    }

    public void setIdProblema(int idProblema) {
        this.idProblema = idProblema;
    }

    public int getIdActivista() {
        return idActivista;
    }

    public void setIdActivista(int idActivista) {
        this.idActivista = idActivista;
    }

    @Override
    public String toString() {
        return "ProblemaActivista{" + "idProblema=" + idProblema + ", idActivista=" + idActivista + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idProblema;
        hash = 97 * hash + this.idActivista;
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
        final ProblemaActivista other = (ProblemaActivista) obj;
        if (this.idProblema != other.idProblema) {
            return false;
        }
        return this.idActivista == other.idActivista;
    }

    
}

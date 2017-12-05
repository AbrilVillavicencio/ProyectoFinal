/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.Iteas.Entidades;

import java.util.Date;

/**
 *
 * @author Abril
 */
public class Asignacion {
    public String nombreAsignacion;
    public Date fechaActual;
    public Date fechaVencimiento;
    public String id;
    public String nombre;
    public String apellido;
    public String descrpicion;
    /**
     * @return the nombreAsignacion
     */
    public String getNombreAsignacion() {
        return nombreAsignacion;
    }

    /**
     * @param nombreAsignacion the nombreAsignacion to set
     */
    public void setNombreAsignacion(String nombreAsignacion) {
        this.nombreAsignacion = nombreAsignacion;
    }

    /**
     * @return the fechaActual
     */
    public Date getFechaActual() {
        return fechaActual;
    }

    /**
     * @param fechaActual the fechaActual to set
     */
    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    /**
     * @return the fechaVencimiento
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the descrpicion
     */
    public String getDescrpicion() {
        return descrpicion;
    }

    /**
     * @param descrpicion the descrpicion to set
     */
    public void setDescrpicion(String descrpicion) {
        this.descrpicion = descrpicion;
    }
    
    
    
    
            
}

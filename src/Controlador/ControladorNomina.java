/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import entidad.Conexion;
import entidad.Nomempleado;
import entidad.NomempleadoJpaController;
import entidad.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danielha
 */
public class ControladorNomina {
    NomempleadoJpaController jp ;
    
    public ControladorNomina(){
         Conexion con;
        con = new Conexion();
        NomempleadoJpaController pbj;
        jp = new NomempleadoJpaController(con.getCon());
    }
    
    public void crearEmpleado(Nomempleado emp){
        try {
            jp.create(emp);
        } catch (Exception ex) {
            Logger.getLogger(ControladorNomina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarEmpleado(Nomempleado emp){
        try {
            jp.edit(emp);
        } catch (Exception ex) {
            Logger.getLogger(ControladorNomina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void borrarEmpleado(String id ){
        try {
            jp.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorNomina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Nomempleado> seleccionarEmpleados(){
        return jp.findNomempleadoAll();
    }
    public Nomempleado seleccionarEmpleado(String id){
        return jp.findNomempleado(id);
    }
    
}

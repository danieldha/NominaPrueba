/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author daniel
 */
public class Conexion {
    private EntityManagerFactory con;
    
    public Conexion(){
        con=Persistence.createEntityManagerFactory("NominaPU");
        
    }
    public EntityManagerFactory getCon(){
        return con;
    }
}

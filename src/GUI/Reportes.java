/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controlador.ControladorNomina;
import entidad.Nomempleado;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author danielha
 */
public class Reportes {
    public Reportes(){
        
    }
    
    public String sueldoBruto(String id){
        String mensaje="";
        ControladorNomina cn = new ControladorNomina();
        Nomempleado e= cn.seleccionarEmpleado(id);
        mensaje=e.getId()+"\n"+e.getNombre()+"\n"+e.getSalario();
        System.out.println(mensaje);
        return mensaje;
        
    }
    public String sueldoreal(String id){
        String mensaje="";
        ControladorNomina cn = new ControladorNomina();
        Nomempleado e= cn.seleccionarEmpleado(id);
        double salario;
        salario = e.getSalario()-e.getSalario()*0.08;
        mensaje=e.getId()+"\n"+e.getNombre()+"\n"+salario;
        System.out.println(mensaje);
        return mensaje;
    }
    public String sueldosEmpleados(){
        ControladorNomina cn = new ControladorNomina();
        List<Nomempleado> lista= cn.seleccionarEmpleados();
        for(int i=0;i<lista.size();i++){
        double salario= lista.get(i).getSalario()-lista.get(i).getSalario()*0.08;
        lista.get(i).setSalario((int) salario);
    }
        String mensaje="";
        for(int i=0;i<lista.size();i++){
            mensaje+=lista.get(i).getId()+" "+lista.get(i).getNombre()+" "+lista.get(i).getSalario()+"\n";
        }
        System.out.println(mensaje);
        return mensaje;
    }
    public int total(){
        ControladorNomina cn = new ControladorNomina();
        List<Nomempleado> lista= cn.seleccionarEmpleados();
        int total=0;
        
        for(int i=0;i<lista.size();i++){
            total+=lista.get(i).getSalario();
        }
        System.out.println(total);
        return total;
    }
    public int sumaSueldos(){
         ControladorNomina cn = new ControladorNomina();
        List<Nomempleado> lista= cn.seleccionarEmpleados();
        int total=0;
        for(int i=0;i<lista.size();i++){
        double salario= lista.get(i).getSalario()-lista.get(i).getSalario()*0.08;
        lista.get(i).setSalario((int) salario);
    }
        
        for(int i=0;i<lista.size();i++){
            total+=lista.get(i).getSalario();
        }
        System.out.println(total);
        return total;
    }
    public double promSueldos(){
        ControladorNomina cn = new ControladorNomina();
        List<Nomempleado> lista= cn.seleccionarEmpleados();
        int total=0;
        
        for(int i=0;i<lista.size();i++){
            total+=lista.get(i).getSalario();
        }
        double prom=total/(lista.size());
        System.out.println(prom);
        return prom;
    }
    public String IDEmpleados(){
        ControladorNomina cn = new ControladorNomina();
        List<Nomempleado> lista= cn.seleccionarEmpleados();
        String mensaje="";
        
        for(int i=0;i<lista.size();i++){
            mensaje+=lista.get(i).getId()+"\n";
        }
        System.out.println(mensaje);
        return mensaje;
    }
    public String menorSueldo(){
        ControladorNomina cn = new ControladorNomina();
        List<Nomempleado> lista= cn.seleccionarEmpleados();
        ArrayList ent;
        ent = new ArrayList();
        for(int i=0;i<lista.size();i++){
            ent.add(lista.get(i).getSalario());
        }
        
        Collections.sort(ent);
        String mensaje = "";
        for(int i=0;i<lista.size();i++){
            if(ent.get(0).equals(lista.get(i).getSalario())){
                mensaje=lista.get(i).getId()+"\n"+lista.get(i).getNombre()+"\n"+lista.get(i).getSalario();
                break;
            }
        }
        System.out.println(mensaje);
        return mensaje;
    }
    
}

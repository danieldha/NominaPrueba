/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danielha
 */
@Entity
@Table(catalog = "danielha", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nomempleado.findAll", query = "SELECT n FROM Nomempleado n"),
    @NamedQuery(name = "Nomempleado.findById", query = "SELECT n FROM Nomempleado n WHERE n.id = :id"),
    @NamedQuery(name = "Nomempleado.findByNombre", query = "SELECT n FROM Nomempleado n WHERE n.nombre = :nombre"),
    @NamedQuery(name = "Nomempleado.findBySalario", query = "SELECT n FROM Nomempleado n WHERE n.salario = :salario")})
public class Nomempleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String id;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String nombre;
    @Basic(optional = false)
    @Column(nullable = false)
    private int salario;

    public Nomempleado() {
    }

    public Nomempleado(String id) {
        this.id = id;
    }

    public Nomempleado(String id, String nombre, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nomempleado)) {
            return false;
        }
        Nomempleado other = (Nomempleado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Nomempleado[ id=" + id + " ]";
    }
    
}

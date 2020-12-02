/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redflix.demo.modelos;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Cesar Viasus
 */
@Entity
@Table(name = "Usuarios")
public class Usuario{
     @Id
          @Column(name = "Alias")
   String idAlias;
      @Column(name = "Nombres")
    String nombre;
     @Column(name = "Apellidos")
    String apellido;
      @Column(name = "Email")
    String email;
       @Column(name = "Celular")
    String celular;
        @Column(name = "Contrasena")
    String contrasena;
         @Column(name = "Fechanacimiento")    
    String fechaNacimiento;
    @OneToMany(mappedBy = "usuario")
   Set<Transmision> transmisiones;
    
    public Usuario(){
        
    }

    public Set<Transmision> getTransmisiones() {
        return transmisiones;
    }

    public void setTransmisiones(Set<Transmision> transmisiones) {
        this.transmisiones = transmisiones;
    }

    public String getIdAlias() {
        return idAlias;
    }

    public void setIdAlias(String idAlias) {
        this.idAlias = idAlias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNaimiento(String fechaNaimiento) {
        this.fechaNacimiento = fechaNaimiento;
    }
    
}

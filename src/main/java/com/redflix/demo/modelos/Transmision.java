/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redflix.demo.modelos;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cesar Viasus
 */
@Entity
@Table(name = "Transmisiones")
public class Transmision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtransmisiones")
    int idTransmision;
    @Temporal(TemporalType.TIMESTAMP)
    Calendar tiempo;
    @ManyToOne
    @JoinColumn(name = "Usuarios_alias")
    Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idpelicula")
    Pelicula pelicula;
    @ManyToOne
    @JoinColumn(name = "idserie")
    Serie serie;

    public Transmision() {

    }

    public int getIdTransmision() {
        return idTransmision;
    }

    public void setIdTransmision(int idTransmision) {
        this.idTransmision = idTransmision;
    }

    public Calendar getTiempo() {
        return tiempo;
    }

    public void setTiempo(Calendar tiempo) {
        this.tiempo = tiempo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redflix.demo.modelos;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Cesar Viasus
 */
@Entity
@Table(name = "Peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpeliculas")
    int idPelicula;
    @Column(name = "Titulo")
    String titulo;
    @Column(name = "Resumen")
    String resumen;
    @Column(name = "Anio")
    int anio;
    @OneToOne
    @JoinColumn(name = "iddirectores")
    Director director;
    @OneToMany(mappedBy = "pelicula")
    Set<Transmision> transmisiones;

    public Pelicula() {

    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Set<Transmision> getTransmisiones() {
        return transmisiones;
    }

    public void setTransmisiones(Set<Transmision> transmisiones) {
        this.transmisiones = transmisiones;
    }

}

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Cesar Viasus
 */
@Entity
@Table(name = "Series")
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseries")
    int idSerie;
    @Column(name = "Titulo")
    String titulo;
    @Column(name = "NumeroTemporadas")
    int numeroTemporadas;
    @Column(name = "NumeroEpisodios")
    int numeroEpisodios;
    @OneToMany(mappedBy = "serie")
    Set<Transmision> transmisiones;

    public Serie() {

    }
    
    @Override
    public String toString(){
        return this.titulo + " consta de " + this.numeroEpisodios + " episodios en " + this.numeroTemporadas + " temporadas";
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public Set<Transmision> getTransmisiones() {
        return transmisiones;
    }

    public void setTransmisiones(Set<Transmision> transmisiones) {
        this.transmisiones = transmisiones;
    }

   
}

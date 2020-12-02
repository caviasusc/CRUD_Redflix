/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redflix.demo;

import com.redflix.demo.modelos.RepDirector;
import com.redflix.demo.modelos.RepPelicula;
import com.redflix.demo.modelos.RepSerie;
import com.redflix.demo.modelos.RepTransmision;
import com.redflix.demo.modelos.RepUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Cesar Viasus
 */
@Component
public class MainSpring implements CommandLineRunner {

    @Autowired
    RepPelicula peliculas;
    @Autowired
    RepSerie series;
    @Autowired
    RepDirector directores;
    @Autowired
    RepUsuario usuarios;
    @Autowired
    RepTransmision transmisiones;  

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(peliculas.count());
//        System.out.println(directores.count());
//        System.out.println(peliculas.existsById(2));
//        System.out.println(usuarios.findById("lucky").get().getNombre());
//        System.out.println(peliculas.findById(2).get().getAnio());
//        System.out.println(directores.findById(102).get().getNombre());
//        System.out.println(directores.);
    }

}

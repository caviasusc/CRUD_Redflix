package com.redflix.demo;

import com.redflix.demo.vista.Ventana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        new Ventana().setVisible(true);
    }
    
    public static void iniciarSpring(){
                SpringApplication.run(DemoApplication.class);

    }

}

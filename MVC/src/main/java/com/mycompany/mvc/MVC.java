/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.MVC_graf;

/**
 *
 * @author 33010
 */
public class MVC {

    public static void main(String[] args) {
        //Declaracion de mi clase principal hacemos la instancia de 
        //nuestra interfaz y la visualizo
       Modelo model = new Modelo();
       MVC_graf view = new MVC_graf();
       Controlador ctrl = new Controlador(model, view);
       ctrl.iniciar();
    }
}

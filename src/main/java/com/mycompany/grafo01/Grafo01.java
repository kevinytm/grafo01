/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grafo01;

import java.util.ArrayList;

/**
 *
 * @author SIM15
 */
public class Grafo01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Vertice01 v1 = new Vertice01("Uno",1);
        Vertice01 v2 = new Vertice01("Dos",2);
        Vertice01 v3 = new Vertice01("Tres",3);
        Vertice01 v4 = new Vertice01("Cuatro",4);
        
        /*Creación de aristas*/
        
        v1.getEdges().add(v3);
        v1.getEdges().add(v4);
        v1.getEdges().add(v2);
        
        v2.getEdges().add(v4);
        v3.getEdges().add(v1);
        v4.getEdges().add(v3);
        
        Grafo grafo01=new Grafo();
        grafo01.addVertice(v1,v2,v3,v4);
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        
        
        
        //Hace referencia al mismo valor v3
        /*Vertice01 verticeAuxiliar = v3;
        System.out.println(v3);
        System.out.println(verticeAuxiliar);
        verticeAuxiliar.setData(345);
        System.out.println(verticeAuxiliar);*/
    }
}

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
        
        
        /*----------------- Grago prueba ---------------------*/
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
        
        Grafo grafo01=new Grafo("El grafo jacoso");
        grafo01.addVertice(v1,v2,v3,v4);
        grafo01.mostrarGradoVertices();
        grafo01.mostrarGradoAdyacencias();
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        
        /* ------------------------ Ejercicio uno -------------------------*/

        System.out.println("\n Ejercicio 1\n");
        
        v1 = new Vertice01("Uno",1);
        v2 = new Vertice01("Dos",2);
        v3 = new Vertice01("Tres",3);
        v4 = new Vertice01("Cuatro",4);
        Vertice01 v5 = new Vertice01("Cinco",5);
        Vertice01 v6 = new Vertice01("Seis",6);
        
        v1.getEdges().add(v2);
        v1.getEdges().add(v6);
        v2.getEdges().add(v1);
        v2.getEdges().add(v5);
        v5.getEdges().add(v2);
        v5.getEdges().add(v6);
        v5.getEdges().add(v4);
        v4.getEdges().add(v5);
        v4.getEdges().add(v3);
        v3.getEdges().add(v4);
        v3.getEdges().add(v6);
        v6.getEdges().add(v1);
        v6.getEdges().add(v3);
        v6.getEdges().add(v5);
        
        Grafo grafo02= new Grafo("Ejercicio 1");
        grafo02.addVertice(v1,v2,v3,v4,v5,v6);
        grafo02.mostrarGradoVertices();
        grafo02.mostrarGradoAdyacencias();
        
        /* ------------------------ Ejercicio dos -------------------------*/
        
        System.out.println("\n Ejercicio 2\n");
        
        //Hace referencia al mismo valor v3
        /*Vertice01 verticeAuxiliar = v3;
        System.out.println(v3);
        System.out.println(verticeAuxiliar);
        verticeAuxiliar.setData(345);
        System.out.println(verticeAuxiliar);*/
    }
}

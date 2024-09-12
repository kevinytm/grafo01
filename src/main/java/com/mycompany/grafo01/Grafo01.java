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
        Vertice01 v1 = new Vertice01();
        v1.setLabel("Uno");
        v1.setData(1);
        v1.setEdges(new ArrayList<>());
        
        Vertice01 v2 = new Vertice01();
        v2.setLabel("Dos");
        v2.setData(2);
        v2.setEdges(new ArrayList<>());

        Vertice01 v3 = new Vertice01();
        v3.setLabel("Tres");
        v3.setData(3);
        v3.setEdges(new ArrayList<>());
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}

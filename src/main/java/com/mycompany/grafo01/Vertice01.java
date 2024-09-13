/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo01;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author SIM15
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Vertice01 {
    private String label;
    private int data;
    private List<Vertice01> edges;
    
    public String toString(){
        return label+"["+data+"]";
    }
}
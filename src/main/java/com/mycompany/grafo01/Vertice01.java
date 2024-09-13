/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo01;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Vertice01 {
    private String label;
    private int data;
    private List<Vertice01> edges;
    
    public Vertice01(String label,int data){
        this.label = label;
        this.data=data;
        this.edges = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return label+"["+data+"]";
    }
}

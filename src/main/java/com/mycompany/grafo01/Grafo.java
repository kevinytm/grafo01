
package com.mycompany.grafo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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

public class Grafo {
    private String name;
    private List<Vertice01> vertices;
    
    public Grafo(String name){
        this.name = name;
        this.vertices = new ArrayList<>();
    }
    
    public void addVertice(Vertice01 vertice){
        vertices.add(vertice);
    }
    
    public void addVertice(Vertice01... vertice){
        /*for(Vertice01 v:vertices){
            this.vertices.add(v);
        }*/
        this.vertices.addAll(Arrays.asList(vertice));
    }
    
    @Override
    public String toString(){
        return name+" [Grado: "+vertices.size()+"]";
    }
    
    public void mostrarGradoVertices(){
        System.out.println("Lista del grado");
        for(Vertice01 v:vertices){
            System.out.println(v+"("+v.getEdges().size()+")");
        }
    }
    
    public void mostrarGradoAdyacencias(){
        System.out.println("Lista de adyacencia");
        for(Vertice01 v:vertices){
            System.out.println(v+"("+v.getEdges().size()+"){");
            for(Vertice01 edge:v.getEdges()){
                System.out.println(edge+", ");
            }
            System.out.println("])");
        }
    }
    
    public void recorridoEnAnchura(Vertice01 inicio){
        Queue<Vertice01> queue = new LinkedList<>();
        inicio.setVisited(true);
        queue.add(inicio);
        
        Vertice01 actual;
        while(!queue.isEmpty()){
            actual =queue.poll();
            System.out.println(actual);
            for (Vertice01 v:actual.getEdges()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}

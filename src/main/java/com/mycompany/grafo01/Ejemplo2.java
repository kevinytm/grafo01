
package com.mycompany.grafo01;

public class Ejemplo2 {
   public static void main(String[] args){
       /*Creaciòn de nodos*/
       Vertice01 vA = new Vertice01("A",1);
       Vertice01 vB = new Vertice01("B",1);
       Vertice01 vC = new Vertice01("C",1);
       Vertice01 vD = new Vertice01("D",1);
       Vertice01 vE = new Vertice01("E",1);
       Vertice01 vF = new Vertice01("F",1);
       Vertice01 vG = new Vertice01("G",1);
       Vertice01 vH = new Vertice01("H",1);
       Vertice01 vI = new Vertice01("I",1);
       
       /*Creación de adyacencias*/
       vA.addEdges(vB,vC,vD);
       vB.addEdges(vE,vC,vA);
       vC.addEdges(vA,vB,vE,vG,vI,vH,vF,vD);
       vD.addEdges(vA,vC,vF);
       vE.addEdges(vB,vG,vC);
       vF.addEdges(vD,vC,vH);
       vG.addEdges(vE,vI,vC);
       vH.addEdges(vF,vC,vI);
       vI.addEdges(vC,vG,vH);
       
       /*Crear grafo y añadir vertices*/
       
       Grafo grafo = new Grafo("Grafo");
       grafo.addVertice(vA,vB,vC,vD,vE,vF,vG,vH,vI);
   
       grafo.recorridoEnAnchura(vC);
   } 
}


package com.mycompany.grafo01;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author kevin
 */

public class TestCola {
   
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        /*Para agregar datos*/
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        
        System.out.println(queue);
        
        /*Consultar Queue*/
        Integer value= queue.peek();//Hojear,ver 
        System.out.println(queue);
        value= queue.peek();
        System.out.println(queue);
        value= queue.peek();
        System.out.println(queue);
        
        /*Sacar de la queue*/
        value=queue.poll();
        System.out.println(queue);
        value=queue.poll();
        System.out.println(queue);
        value=queue.poll();
        System.out.println(queue);
    }
}

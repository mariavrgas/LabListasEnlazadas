/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Classes.SimpleLinkedListADT;


import java.util.LinkedList;
import java.util.Collections;
/**
 *
 * @author Mafe
 */
public class Main {
        
    public static void main(String[] args) {

        
        SimpleLinkedListADT catalogue = new SimpleLinkedListADT(); 
      
        System.out.println("-------- METHOD ADD -------------");
        catalogue.add("maria", 12);
        catalogue.add("daniel", 13);
        catalogue.add("pedrito", 13);   
        catalogue.add("pedro", 13);
        catalogue.print();
        
        System.out.println("--------- METHOD FIND ---------------");
        System.out.println("prueba find: "+catalogue.find(1).getStudents().getName()
                +" /Edad:  "+catalogue.find(1).getStudents().getAge());
        
        System.out.println("------------ REMOVE-------");
        catalogue.remove(1);
        catalogue.print();
        
        System.out.println("---------- GET FIRST --------------");
        
        System.out.println("Nombre:   "+catalogue.getFirst().getStudents().getName()
                +" /Edad:  "+catalogue.getFirst().getStudents().getAge());

        System.out.println("---------- GET LAST --------------");
        System.out.println("Nombre:   "+catalogue.getLast().getStudents().getName()
                +" /Edad:  "+catalogue.getLast().getStudents().getAge());
        
        System.out.println("---------------- REMOVE FIRST ---------");
        catalogue.removeFirst();
        catalogue.print();
        
        
        System.out.println("---------------- REMOVE LAST ---------");
        catalogue.removeLast();
        catalogue.print();
        

        
        

        
        

    }

    
    
}

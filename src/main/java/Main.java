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
        catalogue.add("mar", 13);
        catalogue.add("pedrito", 13);   
        catalogue.add("pedro", 13);
        catalogue.print();
        
        System.out.println("--------- METHOD FIND ---------------");
        catalogue.find(1);
        System.out.println("prueba find: "+catalogue.find(1).getStudents().getName());
        catalogue.print();
      
        
        System.out.println("------------ REMOVE-------");
        catalogue.remove(1);
        catalogue.print();
        
        System.out.println("---------- GET FIRST --------------");
        
        System.out.println("first"+catalogue.getFirst(0));
        catalogue.getFirst(0);
        
        
        
        

        
        

        
        

    }

    
    
}

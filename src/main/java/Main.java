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
      
        
        catalogue.add("maria", 12);
        catalogue.add("mar", 13);
        catalogue.add("pedrito", 13);
        System.out.println("lista estudiantes"+get.Node);
        catalogue.print();
        
        System.out.println("REMOVE-------");
        catalogue.remove(1);
        catalogue.print();
      

    }

    
    
}

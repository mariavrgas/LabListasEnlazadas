/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Classes.SimpleLinkedListADT;


import java.util.LinkedList;
import java.util.Collections;
import javax.swing.JOptionPane;
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
        catalogue.add("pedro", 13);   
        catalogue.add("pedrito", 13);
        
        catalogue.print();
        
        
        int input = -1;
        
                
        do{
            input = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE ALGUNA DE LAS SIGUIENTES OPCIONES:\n"
                +" 1.-Agregar Estudiante\n"
                +" 2.-Buscar Por Indice\n"
                +" 3.-Eliminar Por Indice\n"
                +" 4.-obtener el Primero\n"
                +" 5.-obtener el ultimo\n"
                +" 6.-Eliminar el Primero\n"
                +" 7.-Eliminar el ultimo\n"
                +" 8.-Vaciar el listado\n"
                +" 0.-Cerrar"));
            switch(input){
                case 1:
                    int value = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
                    //catalogue.add(name,age);
                    break;
            
            }
                   
                   
         }while(input != 0);

            
        
    

        
        
        
        
        
        System.out.println("------------- REMOVE LAST --------------");
        catalogue.removeLast();
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
        
        System.out.println("------------REMOVE FIRST --------------");
        catalogue.removeFirst();
        catalogue.print();
        
}}
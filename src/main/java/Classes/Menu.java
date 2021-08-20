package Classes;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe
 */
public class Menu {
    public static void main(String[] args) {
        int option = 0;  String op="";
        
        op=JOptionPane.showInputDialog("SELECCIONE ALGUNA DE LAS SIGUIENTES OPCIONES: \n "
                +" 1.-Agregar Estudiante\n"
                +" 2.-Buscar Por Indice\n"
                +" 3.-Eliminar Por Indice\n"
                +" 4.-obtener el Primero\n"
                +" 5.-obtener el ultimo\n"
                +" 6.-Eliminar el Primero\n"
                +" 7.-Eliminar el ultimo\n"
                +" 8.-Vaciar el listado\n"
                +" 0.-Carrar");
        option=Integer.parseInt(op);
        switch(option){
            case 1:add();break;
            case 2:
            
        }
    }
         
       
  
}

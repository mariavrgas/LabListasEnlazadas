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
        
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int option
        
        while(!salir){
            System.out.println("1.-Agregar Estudiante");
            System.out.println("2.-Buscar Por Indice");
            System.out.println("3.-Eliminar Por Indice");
            System.out.println("4.-obtener el Primero");
            System.out.println("5.-obtener el ultimo");
            System.out.println("6.-Eliminar el Primero");
            System.out.println("7.-Eliminar el ultimo");
            System.out.println("8.-Vaciar el listado");
            System.out.println("0.-Cerrar");
            
            System.out.println("INGRESE UNA OPCION: ");
            option = sn.nextInt();
            
            switch(option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;    
                case 4:
                    break;
                case 5:
                    break;    
                case 6:
                    break; 
                case 7:
                    break;
                case 8:
                    break; 
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("las opciones son entre 1 - 8");
                    
            }
        }    
    }
  
}

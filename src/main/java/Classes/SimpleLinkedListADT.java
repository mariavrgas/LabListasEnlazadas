package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe
 */
public class SimpleLinkedListADT implements Interface {
    
    private Node head ;
    
    private int size = 0;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    } 
    public void print(){
        

       Node current = getHead();

       do{
            System.out.println("nombre: "+ current.getStudents().getName()+" /edad: "+current.getStudents().getAge());
            current = current.getNext();

       }while(current != null);
    
   }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void add(String name , int age){
        
       Students student = new Students(name,age);
               
       Node node = new Node(student);
       
       Node recent = head;
      
       
       
       if (this.head == null){
           this.head = node; 
       }else {
           Node last = getHead();
           
           while(last.getNext() != null){
                last = last.getNext();
            }

            last.setNext(node);
       }
       
       this.size++;
       
        /*while (head.getStudents().getName().compareTo(node.getStudents().getName())> 0 && recent != null){
           node.setNext()= recent;
       }while (recent.getStudents().getName().compareTo(node.getStudents().getName())<0){
           recent.setNext(node);
       }
       */
       
  
        }
    @Override
    public void clear(){
        this.head = null;
        this.size = 0;
    }
    public void remove(int index){
        Node current = getHead();
        int counter = 0;

        if(index >= getSize() || index < 0 ){
            System.out.println("Index doesn't exist!");
        }else if (index == 0 && current != null) {
            this.head = current.getNext();
            current = null;
            this.size--;
        } else {

            do {
                current = current.getNext();
                counter++;
            } while (counter < index-1);

            current.setNext( current.getNext().getNext());

        }

    }
    @Override
    public Node getFirst() throws Exception{
        
        if (head == null) {
            throw new Exception("No elements found in Linked List");
        }
        return head;
    }
    @Override
    public Node getLast() throws Exception{
        
        if(head == null ) {
            throw new Exception("No elements found in Linked List");
        }
        Node current = head;
        while(current.getNext() != null) {
            current = current.next;}
            current.next = null;
 
        return current;}
        
    

    @Override
    public Node find(int index){
        
        if (head == null){
            return null;
        }else{ 
            Node current = getHead();
            int counter = 0;
            while (counter < index && current != null){
                current = current.getNext();
                counter++;
            }
            if (counter != index ){
                return null;
            }else {
                return current;
            }
        }    
    }
    @Override
    public void removeFirst(){
        
        if (head != null) {
            Node first = head;
                    head =head.next;
                    first.next = null;
                    size--;
        }
    }
                   
    @Override
    public void removeLast(){
        
        if(head != null){
            if (head.next == null){
                head = null;
            }else {
                Node current = head ; 
                while (current.next.next != null){
                    current = current.next;
                }
                current.next = null;
            }
        }
    }
}
    
   
    


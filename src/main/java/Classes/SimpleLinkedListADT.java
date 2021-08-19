package Classes;

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
    
    private Node head;
    
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
       
       if (this.head == null){
           this.head = node; 
       }else {
           Node last = getHead();
           
           while(last.getNext() != null){
                last = last.getNext();
            }

            last.setNext(node);
       }
      
        this.size++;}
    
    @Override
    public Node find(int index){
        
        Node current = getHead();
        int counter = 0;

        if (index >= getSize() || index < 0) {
            System.out.println("this index doesn't exist");
        } else if (current == null) {
            System.out.println("list is empty");
        } else if (index == 0) {
            result = this.head.getStudents();
        } else {
            do {
                current = current.getNext();
                counter++;
            } while (counter < index);

           return current;

        }

        this.size++;
        return result;
    
    @Override
    public void clear(){
        this.head = null;
        this.size = 0;
        
       
        
    }
    @Override
    public void obtain(int n){
        if (head == null){
            return null          
        }else {
            Node current = head;
            int counter = 0;
            
            while (counter < n && current.next != null){
                current = current.getNext();
                counter++;
            }
        }
    } 
    }
    @Override
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
    public Node getFirst(int index) throws Exception{
        
        if (head == null) {
            throw new Exception("No elements found in Linked List");
        }
        return head;
    }


}

     
   
    


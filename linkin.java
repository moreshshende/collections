import java.util.*;
import java.util.Scanner;
public class linkin{
public static void main(String[] args){
    
    Node head = new Node(1);
     head.next=new Node(2);
     head.next.next= new Node(3);
     head.next.next.next= new Node(4);
     head.next.next.next.next= new Node(5);
      head.next.next.next.next.next= new Node(6);
     head.next.next.next.next.next.next= new Node(7);


             Node fast=head;
            Node slow=head;
              while(fast !=null && fast.next!=null)
              {
                   fast=fast.next.next;
                   slow=slow.next;
              }
        
             System.out.println(slow.val +" Middle element of linkedlist ");

 // for printing 
      printlinked(head);  

      System.out.println();       
//for reversed
          reversed(head);  
            System.out.println();     
// for middle element
   //Middle element algo
           
       
  }
  
//function reversed linkedlist
 static void reversed(Node head)
 {
     Node temp=head;
     Node prev=null;
     Node next=null;
      while(temp !=null)
      {
          next=temp.next;
          temp.next=prev;
          prev=temp;
          temp=next;
      }
      
      printlinked(prev);
 }
  //function of print the linkedlist
  static void printlinked(Node head)
  {
       while(head !=null)
       {
           System.out.print(head.val +" ");
            head=head.next;
       }
  }
  static class Node{
      int val;
       Node next;
       Node(int val)
       {
           this.val=val;
       }
  }
}
package com.mycompany.dsawith_java;

/**
 * @author MF T
 */
class Node {
    int data;
    Node address;


    public Node(int data) {
        this.data = data;
        this.address = null;
    }

}

public class LinkedList {
    Node head, tail;
    int size;


    public LinkedList() {
        head = tail = null;
        size = 0; 
    }
    
    public void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = tail = n;
        } else {
            tail.address = n; 
            tail = n;  
        }
        size++;
    }
    
        public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.address;
        }
        }
        
        public void printSize(){
            System.out.println("Size of LinkedList:"+ size);
        }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Print the linked list
        list.printList();
        list.printSize();
    }
}          



 
//    
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        
//        node1.address = node2;
//        node2.address = node3;
//        node3.address = node4;
//        node4.address = null;
//        
//
////        System.out.println(node1.data);
////        System.out.println(node1.address.data);
////        System.out.println(node1.address.address.data);
////        System.out.println(node1.address.address.address.data);
//        System.out.println(node2.data);
//        System.out.println(node3.data);
//   




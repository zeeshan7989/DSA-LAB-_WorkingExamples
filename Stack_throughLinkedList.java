/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsawith_java;

/**
 *
 * @author MF T
 */

public class Stack_throughLinkedList {
    private Node top;

    // Inner Node class
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Insert at the top of the stack
    public void insertFirst(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    // Delete the top node
    public Node deleteFirst() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot perform pop operation.");
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }

    // Display all elements in the stack
    public void displayList() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.println("Stack elements (from top to bottom):");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class LinkedListStack {
    private Stack_throughLinkedList linkedList = new Stack_throughLinkedList();

    // Push an element onto the stack
    public void push(int element) {
        linkedList.insertFirst(element);
    }

    // Pop the top element from the stack
    public void pop() {
        linkedList.deleteFirst();
    }

    // Display the stack
    public void displayStack() {
        linkedList.displayList();
    }
}

class LLStackClient {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(50);
        stack.push(70);
        stack.push(190);

        System.out.println("1. Stack after push operations:");
        stack.displayStack();

        System.out.println("\n2. Stack after pop operation:");
        stack.pop();
        stack.displayStack();
    }
}



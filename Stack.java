package com.example;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    // Constructor to initialize the stack
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;  // Empty stack
    }
    
    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }
    
    // Pop an element off the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        } else {
            return stackArray[top--];
        }
    }
    
    // Peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        } else {
            return stackArray[top];
        }
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
    
    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Stack with a max size of 5
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Peek at top element: " + stack.peek());
        
        stack.pop();
        stack.pop();
        
        System.out.println("Peek after popping two elements: " + stack.peek());
        
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }

}



/**
 * file: Queue.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 6 Chap 10, exercise 10
 * due date: Apr 20, 2017
 * version: 1.8
 *
 * Create a queue containing 20 numbers and display them
 */ 
public class Queue {
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 8;
  
  //construct stack with the default capacity
  public Queue() {
    this (DEFAULT_CAPACITY);
  }
  
  //Construct a stack with the specified maximum capacity
  public Queue(int capacity) {
    elements = new int[capacity];
  }
  
  //Push a new integer to the top of the stack
  public void enqueue(int v) {
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    
    elements[size ++] = v;
  }
  
  
  //Return and remove top element from the stack
  public int dequeue() {
    int v = elements[0]; //retrieve first element
    int[] temp = new int[elements.length]; //copy element into temp
    System.arraycopy(elements, 1, temp, 0, size);
    elements = temp; //assign temp to elements array
    size --; //decreasing the queue size
    return v;
  }
  
  //Test whether the stack is empty
  public boolean empty() {
    return size == 0;
  }
  
  
  //Return the number of elements in the stack
  public int getSize() {
    return size;
  } 
}

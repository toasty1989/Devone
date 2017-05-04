/**
 * file: Queue.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 6 Chap 10, exercise 10
 * due date: Apr 20, 2017
 * version: 1.8
 *
 * Create a program to test queue.java
 */ 
public class TestQueue {
  public static void main(String[] args) {
    
    Queue queue = new Queue(); //creat queue object
    
    for(int i = 0; i < 20; i++) {
      queue.enqueue(i + 1); //call method to add element
    }
    
    while(!queue.empty()) { //call of dequeue method to delete an element
      System.out.println("dequeued element is: "
              + queue.dequeue());
    }
  }
}

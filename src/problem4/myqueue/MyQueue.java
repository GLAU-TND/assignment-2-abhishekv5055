/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {
   private static class Node{
      int data;
      Node next;

      public int getData() {
         return data;
      }

      public void setData(int data) {
         this.data = data;
      }

      public problem4.myqueue.MyQueue.Node getNext() {
         return next;
      }

      public void setNext(problem4.myqueue.MyQueue.Node next) {
         this.next = next;
      }
   }
}

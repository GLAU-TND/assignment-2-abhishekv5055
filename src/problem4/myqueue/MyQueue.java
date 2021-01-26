/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {
   private Node front;
   private Node rear;

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

      public MyQueue(){
         front = null;
         rear = null;
      }

      public void enQueue(int data){
         Node node = new Node();
         node.setData(data);
         if(front == null){
            front = rear = node;
         }else{
            rear.setData(node);
            rear = node;
         }
      }
      public void preSuccessor(TreeNode root){
         if(root != null){
            enQueue(root.getKey());
            preSuccessor(root.getLeft());
            preSuccessor(root.getRight());
         }
      }

      public void getPreSuccessor(){
         Node node = front.getNext();
         while(node != null){
            System.out.println(node.getData() + " ");
            node = node.getNext();
         }
      }
   }
}

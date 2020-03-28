/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

public class MyPriorityQueue<Student> {
    int size = 0;
    int front = -1;
    int rear = -1;
    LinkedList<Student> linkedList = new LinkedList<>();

    public Student enQueue(Student data){
        linkedList.add(++rear, data);
        size++;
    }
    public Student deQueue(){
        size--;
        front++;
    }


}

package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    ArrayList<String> myq = new ArrayList<String>();

    public void enQueue(String data) {
        myq.add(data);
    }
    public String deQueue() {
        int len = myq.size();
        if(len == 0) {
            System.out.println("큐가 비었습니다");
            return null;
        }
        return myq.remove(0);
    }
}
public class QueueTest {
    public static void main(String[] args) {
        MyQueue msq = new MyQueue();

        msq.enQueue("A");
        msq.enQueue("B");
        msq.enQueue("C");

        System.out.println(msq.deQueue());
        System.out.println(msq.deQueue());
        System.out.println(msq.deQueue());
    }
}

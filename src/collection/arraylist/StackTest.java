package collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayS = new ArrayList<String>();

    public void push(String data) {
        arrayS.add(data);
    }
    public String pop() {
        int len = arrayS.size();
        if(len == 0) {
            System.out.println("스택이 비어있음");
            return null;
        }
        // python 한정 인덱스(-1)--> return arrayS.remove(-1);
        return arrayS.remove(len - 1);
    }
    public String peek() {
        int len = arrayS.size();
        if(len == 0) {
            System.out.println("스택이 비어있음");
            return null;
        }
        // python 한정 인덱스(-1)--> return arrayS.remove(-1);
        return arrayS.get(len - 1);
    }
}
public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

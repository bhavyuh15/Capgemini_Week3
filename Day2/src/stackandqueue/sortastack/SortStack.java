package stackandqueue.sortastack;

import java.util.Stack;


public class SortStack {

    public static void insertSort(Stack<Integer> s, int n) {
        if (s.isEmpty() || s.peek() <= n) {
            s.push(n);
        } else {
            int temp = s.pop();
            insertSort(s, n);
            s.push(temp);
        }
    }

    public static void SortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop();
            SortStack(s);
            insertSort(s, temp);
        }

    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(2);
        s.push(7);
        s.push(1);
        s.push(3);
        s.push(6);
        s.push(4);
        SortStack(s);
        System.out.println(s);
    }
}
package stackandqueue.queueusingstack;

import java.util.Stack;

public class Queue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void Enqueue(int element) {
        s1.push(element);
    }

    public int Dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}

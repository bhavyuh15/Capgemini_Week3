package stackandqueue.queueusingstack;

import java.util.Stack;

public class QueueInStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);

        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());

    }

}
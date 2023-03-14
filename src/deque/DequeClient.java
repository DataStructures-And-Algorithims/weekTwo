package deque;

public class DequeClient {
    public static void main(String[] args) {
        Deque<String> dq = new Deque<String>();
        dq.addFirst("a");
        dq.addFirst("d");
        dq.addFirst("c");
        dq.addFirst("b");
        dq.printDequeue();
        dq.removeFirst();
        dq.printDequeue();
        dq.addLast("k");
        dq.printDequeue();
    }

}
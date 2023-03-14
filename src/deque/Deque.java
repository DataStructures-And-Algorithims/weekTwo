package deque;

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Deque<Item> {
    // At 0 the first node and last node should be equal
    private Node first;
    private Node last;
    private int size;

    private class Node {
        Item item;
        Node next;
        Node previous;

        public Node(Item item, Node next, Node previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }

    public Deque() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (size == 0 && first == null && last == null);
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        if (isEmpty()) {
            first = new Node(item, null, null);
            // At item 1 both the first and last node will be equal
            last = first;
            ++size;
        }
        else {
            Node oldFirst = first;
            first = new Node(item, oldFirst, null);
            oldFirst.previous = this.first;
            ++size;
        }
    }

    public void addLast(Item item) {
        if (isEmpty()) {
            last = new Node(item, null, null);
            // At item 1 both the first and last node will be equal
            first = last;
            ++size;
        }
        else {
            Node oldLast = last;
            last = new Node(item, null, oldLast);
            oldLast.next = last;
            ++size;
        }
    }

    public void removeFirst() {
        first = first.next;
        first.previous = null;
        --size;
    }

    public void removeLast() {
        last = last.previous;
        last.next = null;
        --size;
    }

    public void printDequeue() {
        Node current = first;

        if (first == null && last == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("[");
        while (current != null) {
            System.out.print(" " + current.item + " ");
            current = current.next;
        }
        System.out.println("]");
        System.out.println("Empty flag: " + isEmpty() + " Duque size: " + size());
        System.out.println(".........................................");
    }
}
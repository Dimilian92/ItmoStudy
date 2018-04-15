package Zachet;


public class Queue<T> {
    private Node1 head;

    public boolean add(T value) {
        head = new Node1(value);
        if (head != null) {
            return true;
        } else {
            return false;
        }

    }


    class Node1<T> {
        private int size = 0;
        private Node1 first = null;
        private Node1 last = null;
        T value;

        private Node1 next;
        private Node1 prev;

        Node1(T element) {
            this.value = value;
            this.prev = last;
            this.next = null;
            if (last != null) {
                last.next = this;
            }
            if (first == null) {
                first = this;
            }
            last = this;
            size += 1;
        }
    }
}



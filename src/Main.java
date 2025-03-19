import java.util.LinkedList;

/*
NAME:Omosimua Okhai Gabriel
PROJECT: Java Deque Implementation
 */
class Deque {
    private LinkedList<Integer> deque;

    //Default constructor meant to initialize as  we run the class
    public Deque() {
        this.deque = new LinkedList<>();
    }

    public void insertFront(int item) {
        deque.addFirst(item);
    }

    public void insertRear(int item) {
        deque.addLast(item);
    }

    public Integer deleteFront() {
        if (isEmpty()) {
            return null;
        }
        return deque.removeFirst();
    }

    public Integer deleteRear() {
        if (isEmpty()) {
            return null;
        }
        return deque.removeLast();
    }

    public Integer getFirst() {
        if (isEmpty()) {
            return null;
        }
        return deque.getFirst();
    }

    public Integer getLast() {
        if (isEmpty()) {
            return null;
        }
        return deque.getLast();
    }

    public int size() {
        return deque.size();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.insertFront(25);
        dq.insertRear(50);
        System.out.println(dq.getFirst());  // Output: 25
        System.out.println(dq.getLast());   // Output: 50
        System.out.println(dq.size());      // Output: 2
        dq.deleteFront();
        dq.deleteRear();
        System.out.println(dq.size());      // Output: 0
    }
}

import java.util.Scanner;

public class List {

    Node head = null;
    Node tail = null;
    int size = 1;

    // head.prev = new node
    // new node.next = head
    // head = new node

    public boolean isEmpty() {

        if (head == null) {
            return true;
        }
        return false;
    }


    public Node insertFromHead(String s) {

        Node node = new Node(s);

        if (isEmpty()) {
            head = node;
            tail = node;
            return head;
        }
        head.prev = node;
        node.next = head;
        head = node;

        return head;
    }

    public Node insertFromTail(String s) {
        Node node = new Node(s);

        if (isEmpty()) {
            head = node;
            tail = node;
            return tail;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;

        return tail;
    }

    public String printFromHead() {

        Node n = head;
        String res = "";

        while (n != null) {
            res = res + n.data;
            n = n.next;
        }
        return res;
    }

    public String printFromTail() {

        Node n = tail;
        String res = "";

        while (n != null) {
            res = res + n.data;
            n = n.prev;
        }
        return res;
    }


    public Node removeFromHead() {

        Node n = head;

        if (isEmpty()) {

            return n;
        }
        if (head == tail) {

            n = head;
            head = null;
            tail = null;

            return n;
        }
        return head;
    }

    public Node findElement(String s) {

        Node n = head;

        if (isEmpty()) {
            return n;
        }

        while (n != null) {

            if (n.data.equals(s)) {

                return n;
            }
            size++;
            n = n.next;
        }
        return n;
    }

    public void removeNode(String s) {

        Node n = head;

        if (isEmpty()) {

            return;
        }

        while (n != null) {

            if (n.data == s) {

                n.next.prev = null;
                n.prev.next = null;

                n.prev.next = n.next;
                n.next.prev = n.prev;
            }
            n = n.next;
        }
    }

    public void insertNode(String neighbour, String in) {

        Node node = new Node(in);

        findElement(neighbour);

        if (isEmpty()) {

            return;
        }




    }


    public void removeLeftTether(String s) {

        Node n = head;

        if (isEmpty()) {

            return;
        }

        if (n != null) {

            if (n.data == s) {

                n.next.prev = null;
            }
        }
    }

    public void removeRightTether(String s) {

        Node n = head;

        if (isEmpty()) {

            return;
        }

        if (n != null) {

            if (n.data == s) {

                n.prev.next = null;
            }
        }
    }
}

public class List {

    Node head = null;
    Node tail = null;

    // head.prev = new node
    // new node.next = head
    // head = new node

    public boolean isEmpty()    {

        if (head == null)   {
            return true;
        }
        return false;
    }


    public Node insertFromHead(String s)    {

        Node node = new Node(s);

        if (isEmpty())  {
            head = node;
            tail = node;
            return head;
        }

        head.prev = node;
        node.next = head;
        head = node;

        return head;
    }

    public String printFromHead() {

        Node n = tail;
        String res = "";

        while (n != null)   {
            res = res + n.data;
            n = n.next;
        }
        return res;
    }
}


import javax.xml.crypto.Data;

public class Node {

    // Data (string)
    // Prev and next

    Node prev = null;
    Node next = null;

    String data;


    public Node(String data) {
        this.data = data;
    }
}

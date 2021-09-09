import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListsTest {

    List list = new List();

    List listEmpty = new List();


    @BeforeEach
    void setup()    {

        Node node0 = new Node("1");
        Node node1 = new Node("2");
        Node node2 = new Node("3");
        Node node3 = new Node("4");
        Node node4 = new Node("5");
        Node node5 = new Node("6");



    }


    @org.junit.jupiter.api.Test
    void isEmpty() {

        assertEquals(true, list.isEmpty());
        list.insertFromHead("Viktor");
        assertEquals(false, list.isEmpty());

    }


    @org.junit.jupiter.api.Test
    void insertFromHead() {


    }

    @org.junit.jupiter.api.Test
    void printListFromHead()    {

        list.insertFromHead("1");
        list.insertFromHead("2");
        list.insertFromHead("3");


        assertEquals("321",list.printFromHead());
    }

    @org.junit.jupiter.api.Test
    void printListFromTail()    {

        list.insertFromTail("1");
        list.insertFromTail("2");
        list.insertFromTail("3");


        assertEquals("321",list.printFromTail());
    }

    @org.junit.jupiter.api.Test
    void removeFromHead()   {

        Node node = new Node("");
        assertEquals(node.data, listEmpty.removeFromHead());

    }

    @org.junit.jupiter.api.Test
    void findElement()  {

        Node node = new Node("1");
        Node node3 = new Node("3");
        Node node2 = new Node("2");
        list.insertFromHead(node.data);
        list.insertFromHead(node2.data);
        list.insertFromHead(node3.data);

        assertEquals("2", list.findElement("2").data);

    }

    @Test
    void removeNode()    {

        Node node = new Node("1");
        Node node3 = new Node("3");
        Node node2 = new Node("2");
        Node node15 = new Node("15");
        Node node5 = new Node("5");
        Node node9 = new Node("9");
        Node node7 = new Node("7");
        list.insertFromHead(node.data);
        list.insertFromHead(node2.data);
        list.insertFromHead(node3.data);
        list.insertFromHead(node15.data);
        list.insertFromHead(node5.data);
        list.insertFromHead(node9.data);
        list.insertFromHead(node7.data);

        list.removeNode("2");

        System.out.println(list.printFromTail());

        assertEquals("1315597",list.printFromTail());
    }

    @Test
    void insertNode()   {

        Node node = new Node("1");
        Node node3 = new Node("3");
        Node node2 = new Node("2");
        Node node15 = new Node("15");
        Node node5 = new Node("5");
        Node node9 = new Node("9");

        Node node7 = new Node("7");
        list.insertFromHead(node.data);
        list.insertFromHead(node2.data);
        list.insertFromHead(node3.data);
        list.insertFromHead(node15.data);
        list.insertFromHead(node5.data);
        list.insertFromHead(node9.data);
        list.insertFromHead(node7.data);

        list.insertNode("9","42");

        assertEquals("1231559427",list.printFromTail());

    }


}
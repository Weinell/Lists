import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.NoopCharAppender;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

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



}
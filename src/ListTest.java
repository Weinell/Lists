import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list = new List();


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

}
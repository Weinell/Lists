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
}
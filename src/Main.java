public class Main {
    public static void main(String[] args) {


        List list = new List();
        list.insertFromHead(new Node("1"));
        list.insertFromHead(new Node("2"));
        list.insertFromHead(new Node("3"));
        list.insertFromHead(new Node("4"));
        list.insertFromHead(new Node("5"));
        list.insertFromHead(new Node("6"));
        list.insertFromHead(new Node("7"));

        list.insertNode(list.findElement("3"),"tsukani");


    }
}

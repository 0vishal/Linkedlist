package LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ListTest {
    List list;

    @BeforeAll
    public  void execute() {
        list = new List();
}
    @Test
    public void addNode() {

        list.addNode(50);
        list.addNode(30);
        list.addNode(70);
}

    @Test
    public void addStart() {

       list.addStart(56);
       list.addStart(30);
       list.addStart(70);
}
    @Test
    public void append() {

        list.append(56);
       list.append(30);
       list.append(70);
    }

    @Test
    public void insert() {

        list.append(56);
        list.append(70);

        list.insert(30,1);

    }
    @Test
    public void delete() {

        list.addStart(56);
        list.addStart(30);
        list.addStart(70);
        list.delete();
}
    @Test
    public void deleteEnd() {

        list.addStart(56);
        list.addStart(30);
        list.addStart(70);
        list.deleteEnd();
    }
    @Test
    public void Search() {
        list.addStart(56);
        list.addStart(30);
        list.addStart(70);
        list.search(30);
}
}
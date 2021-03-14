package LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ListTest {
    List list;

    @BeforeAll
    public void execute() {
        list = new List();
}
    @Test
    public void addNode() {

        list.addNode(50);
        list.addNode(30);
        list.addNode(70);
}
 
    }

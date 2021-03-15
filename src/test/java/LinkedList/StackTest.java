package LinkedList;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StackTest {

        StackQueue stackqueue;

        @BeforeAll
        public  void execute()
        {
            stackqueue =new StackQueue();
        }

        @Test
        public void push()
        {
            stackqueue.push(56);
            stackqueue.push(30);
            stackqueue.push(70);
        }

        @Test
        public void pop()
        {
            stackqueue.push(56);
            stackqueue.push(30);
            stackqueue.push(70);
            for (int i=0;i<3;i++)
            {
                stackqueue.pop();
            }
        }
    }

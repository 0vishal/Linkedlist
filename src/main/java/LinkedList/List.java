package LinkedList;

public class List<T> {

    class Node<T> {
        T data;
        Node<T> Next;

        public Node(T data) {
            this.data = data;
            this.Next = null;
        }
    }

    public Node<T> head = null;
    public Node<T> tail = null;

    public void addNode(T data) {

        Node<T> newNode = new Node<T>(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else
            tail.Next = newNode;
        tail = newNode;

    }

    public void addStart(T data) {

        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.Next = temp;
        }
    }

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {

            head = newNode;
            tail = newNode;
        }
        else {
            tail.Next = newNode;
            tail = newNode;
        }
    }

    public Node insert(T data, int position){

        Node<T> newnode = new Node<T>(data);
        newnode.data = data;
        Node<T> current = head;
        Node<T> previous = null;
        int count=0;
        while (count < position) {
            previous = current;
            current = current.Next;
            count++;
        }
        newnode.Next = current;
        if (previous != null) {
            previous.Next = newnode;
            return head;
        }
        return newnode;
    }
    public void delete() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {

            if(head != tail) {
                head = head.Next;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void displayList() {
        Node<T> current = head;

        if (head == null) {

            System.out.println("list is empty");
        } else {
            System.out.println(" linked list: ");
            while (current != null) {

                System.out.println(current.data + "");
                current = current.Next;
            }

        }
    }

}

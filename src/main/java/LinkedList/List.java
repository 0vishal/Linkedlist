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
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            if (head != tail) {
                Node current = head;
                while (current.Next != tail) {
                    current = current.Next;
                }
                tail = current;
                tail.Next = null;
            } else {
                head = tail = null;
            }
        }
    }

    public void search(T data) {
        Node<T> current = head;
        int i = 1;
        boolean flag = false;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                if(current.data != data)
                {
                    current = current.Next;
                    i=i+1;
                }
                flag=true;
                break;
            }
        }
        if(flag==true)
            System.out.println("" +data+ " is at position "+ i);
        else
            System.out.println("not in the list");
    }

    public void insertafterkey(T key,T data) {
        Node<T> current = head;
        while (current != key)
        {
            current= current.Next;
        }
        Node<T> new_node = new Node<T>(data);
        Node<T> prev_node = current.Next;
        current.Next = new_node;
        new_node.Next = prev_node;

    }
        public void displayList () {
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

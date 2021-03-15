package LinkedList;

public class StackQueue<T> {

        List listadd;

    {
        listadd = new List();
    }

    public void push(T value)
        {
            this.listadd.append(value);
            this.listadd.displayList();
        }
    }

    public void pop() {
            this.listadd.delete();
            this.listadd.displayList();

}

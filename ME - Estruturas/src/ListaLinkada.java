public class ListaLinkada<T> {
    private Node<T> topo;
    private int size;

    public ListaLinkada() {
        this.topo = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (topo == null) {
            topo = newNode;
        } else {
            Node<T> current = topo;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public void remove(T data) {
        Node<T> current = topo;
        Node<T> previous = null;
        while (current != null && !current.getData().equals(data)) {
            previous = current;
            current = current.getNext();
        }
        if (current != null) {
            if (previous == null) {
                topo = current.getNext();
            } else {
                previous.setNext(current.getNext());
            }
            size--;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        Node<T> current = topo;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

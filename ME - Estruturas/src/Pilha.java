public class Pilha<T> {
    private Node<T> topo;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Pilha() {
        this.topo = null;
        this.size = 0;
    }

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        if (topo == null) {
            topo = newNode;
        } else {
            newNode.next = topo;
            topo = newNode;
        }
        size++;
    }

    public T pop() {
        if (topo == null) {
            return null;
        }
        T data = topo.data;
        topo = topo.next;
        size--;
        return data;
    }

    public T peek() {
        if (topo == null) {
            return null;
        }
        return topo.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

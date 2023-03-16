public class Fila<T> {
    private int size;
    private Node<T> topo;
    private Node<T> fundo;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Fila() {
        this.size = 0;
        this.topo = null;
        this.fundo = null;
    }

    public void enfileirar(T data) {
        Node<T> newNode = new Node<T>(data);
        if (fundo == null) {
            topo = newNode;
            fundo = newNode;
        } else {
            fundo.next = newNode;
            fundo = newNode;
        }
        size++;
    }

    public T desfileirar() {
        if (topo == null) {
            return null;
        }
        T data = topo.data;
        topo = topo.next;
        if (topo == null) {
            fundo = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

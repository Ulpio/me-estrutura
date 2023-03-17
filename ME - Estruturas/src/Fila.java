public class Fila<T> {
    public int size;
    public Node<T> topo;
    public Node<T> fundo;


    public Fila() {
        this.size = 0;
        this.topo = null;
        this.fundo = null;
    }

    public void enfileirar(T data){
        Node<T> newNode = new Node<T>(data);
        if (topo == null) {
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

    public T getObject(){
        return topo.data;
    }
    public T getFundo(){
        return fundo.data;
    }
    public T getTopo(){
        return topo.data;
    }
}

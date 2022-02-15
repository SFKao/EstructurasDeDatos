public class Nodo {
    private Entero v;
    private Nodo next;

    public Nodo(Entero v, Nodo next) {
        this.v = v;
        this.next = next;
    }

    public Nodo(Entero v) {
        this.v = v;
    }

    public Entero getV() {
        return v;
    }

    public void setV(Entero v) {
        this.v = v;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}

public class Pila {
    Nodo inicio;
    int size;

    public Pila() {
        inicio = null;
        size = 0;
    }

    public void push(Object dato){
        inicio = new Nodo(dato,inicio);
        size++;
    }

    public Object pop() throws NoHayElementoEnLaPila{
        if(this.inicio == null)
            throw new NoHayElementoEnLaPila("No hay elementos pero has intentado hacer un pop!");

        size--;
        Nodo r = inicio;
        inicio = inicio.next;
        return r.v;
    }

    public int getSize() {
        return size;
    }

    public boolean hasNext(){
        return inicio != null;
    }

    public Object buscar(Object c){
        Nodo n = inicio;
        while(n!=null){
            if(n.equals(c))
                return n;
            n = n.next;
        }
        return null;
    }

    @Override
    public String toString() {
        String aux = "Pila{{" +
                "size=" + size +"}";
        Nodo n = inicio;
        while(n!=null){
            aux = aux + ", " + n.v.toString();
            n = n.next;
        }
        return aux + "}";
    }
}

class Nodo{
    Object v;
    Nodo next = null;

    public Nodo(Object v, Nodo next) {
        this.v = v;
        this.next = next;
    }

    public Nodo(Object v) {
        this.v = v;
    }

    public Object getV() {
        return v;
    }

    public void setV(Object v) {
        this.v = v;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}

class NoHayElementoEnLaPila extends Exception{

    public NoHayElementoEnLaPila() {
    }

    public NoHayElementoEnLaPila(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

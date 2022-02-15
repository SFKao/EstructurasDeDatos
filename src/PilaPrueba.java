public class PilaPrueba implements Cloneable{
    NodoPrueba inicio;
    int size;

    public PilaPrueba() {
        inicio = null;
        size = 0;
    }

    public void push(EnteroPrueba dato){
        inicio = new NodoPrueba(dato,inicio);
        size++;
    }

    public EnteroPrueba pop() throws NoHayElementoEnLaPila{
        if(this.inicio == null)
            throw new NoHayElementoEnLaPila("No hay elementos pero has intentado hacer un pop!");

        size--;
        NodoPrueba r = inicio;
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
        NodoPrueba n = inicio;
        while(n!=null){
            if(n.equals(c))
                return n;
            n = n.next;
        }
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PilaPrueba p = new PilaPrueba();
        p.cloneNext(inicio,p);
        return p;
    }
    
    private void cloneNext(NodoPrueba n, PilaPrueba s) throws CloneNotSupportedException{
        if(n!=null) {
            cloneNext(n.next,s);
            s.push((EnteroPrueba) n.v.clone());
        }
    }

    @Override
    public String toString() {
        String aux = "Pila{{" +
                "size=" + size +"}";
        NodoPrueba n = inicio;
        while(n!=null){
            aux = aux + ", " + n.v.toString();
            n = n.next;
        }
        return aux + "}";
    }
}

class NodoPrueba implements Cloneable{
    EnteroPrueba v;
    NodoPrueba next = null;

    public NodoPrueba(EnteroPrueba v, NodoPrueba next) {
        this.v = v;
        this.next = next;
    }

    public NodoPrueba(EnteroPrueba v) {
        this.v = v;
    }

    public EnteroPrueba getV() {
        return v;
    }

    public void setV(EnteroPrueba v) {
        this.v = v;
    }

    public NodoPrueba getNext() {
        return next;
    }

    public void setNext(NodoPrueba next) {
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

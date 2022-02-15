public class PilaEnlace implements Pila{
    private int size;
    private Nodo inicio;

    public PilaEnlace() {
        inicio = null;
        size = 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        PilaEnlace p = new PilaEnlace();
        try {
            p.cloneNext(inicio, p);
        }catch (Exception e){}
        return p;
    }

    //cloneNext es un metodo ambiguo, pero es que es necesario ya que una pila se lee de arriba a abajo, pero al insertar debe ser de abajo a arriba.
    //por ello utilizo este metodo recursivo, para que inserte desde el fondo.
    private void cloneNext(Nodo n, PilaEnlace s) throws Exception{
        if(n!=null) {
            cloneNext(n.getNext(),s);
            s.push(n.getV());
        }
    }

    @Override
    public void push(Entero dato){
        try {
            inicio = new Nodo((Entero) dato.clone(),inicio);
        } catch (CloneNotSupportedException e) {return;}
        size++;
    }

    @Override
    public Entero pop() throws PilaException{
        if(this.inicio == null)
            throw new PilaException("No hay elementos pero has intentado hacer un pop!");
        size--;
        Nodo r = inicio;
        inicio = inicio.getNext();
        return r.getV();
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean hasNext(){
        return inicio != null;
    }

    public Object buscar(Object c){
        if(c==null||!(c instanceof Entero))
            return null;
        Nodo n = inicio;
        while(n!=null){
            if(n.getV().equals(c))
                return n.getV();
            n = n.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        String aux = "PilaEnlace{{" +
                "size=" + size +"}";
        Nodo n = inicio;
        while(n!=null){
            aux = aux + ", " + n.getV().toString();
            n = n.getNext();
        }
        return aux + "}";
    }


}

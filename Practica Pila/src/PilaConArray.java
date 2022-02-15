public class PilaConArray implements Pila {
    private Entero[] arr;
    private int size;

    @Override
    public Object clone() throws CloneNotSupportedException {
        PilaConArray n = new PilaConArray();
        for(int i = 0; i < size; i++)
            n.arr[i] = (Entero) this.arr[i].clone(); //creo clones porque no quiero se pueda modificar un dato una vez almacenado
        n.size = this.size;
        return n;
    }

    @Override
    public String toString() {
        String aux = "PilaConArray{{" +
                "size=" + size +"}";
        for(int i = size-1; i >=0;i--)
            aux = aux + ", " + arr[i].toString();
        return aux + "}";
    }
    @Override
    public Object pop() throws Exception {
        if(size <= 0)
            throw new PilaException("Se ha intentado hacer pop en una pila sin elementos!");
        Entero a = arr[--size];
        arr[size] = null;
        return a;
    }
    @Override
    public void push(Entero e) throws Exception {
        if(size >= TAM_MAX)
            throw new PilaException("Se ha intentado insertar un elemento mas de la capacidad maxima!");
        arr[size++] = (Entero) e.clone(); //creo copias porque no quiero los datos se modifiquen una vez introducidos
    }

    public PilaConArray() {
        //para mi, la Pila es una clara composicion, asi que el array lo creara el mismo y tampoco tendra setter para este.
        //Como size es un atributo interno que solo debe ser modificado internamente, no permito hacer set.
        arr = new Entero[TAM_MAX];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean hasNext(){ //para iterar
        return size>0;
    }
    
    
    
}

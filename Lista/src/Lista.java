import java.util.ArrayList;

public class Lista implements MiLista, Cloneable{

    private int size;
    private NodoLista cabeza;
    private NodoLista cola;

    public Lista() {
    }

    public void addInicio(Entero p){
        try {
            this.cabeza = new NodoLista(cabeza, (Entero) p.clone());
            size++;
            if(this.cola == null){
                cola = cabeza;
            }
        } catch (CloneNotSupportedException e) {
        }
    }

    public void addFinal(Entero p){
        try {
            if(this.cola!=null) {
                this.cola.setNext(new NodoLista((Entero) p.clone()));
                this.cola = cola.getNext();
            }else{
                cola = new NodoLista((Entero) p.clone());
            }
            size++;
            if(cabeza==null)
                cabeza = cola;
        } catch (CloneNotSupportedException e) {
        }
    }

    public Entero get(int i){
        if(i >= size||i<0)
            throw new IndexOutOfBoundsException();
        NodoLista aux = cabeza;
        while(i > 0){
            aux = aux.getNext();
            i--;
        }
        return aux.getValor();
    }

    public Entero remove(int i){
        if(i >= size||i<0)
            throw new IndexOutOfBoundsException();
        NodoLista aux = cabeza;
        while(i > 1){
            aux = aux.getNext();
            i--;
        }
        Entero ret = aux.getNext().getValor();
        if(aux.getNext().getNext()!=null)
            aux.setNext(aux.getNext().getNext());
        else{
            aux.setNext(null);
            cola = aux;
        }

        size--;
        return ret;
    }

    @Override
    public String toString() {
        String aux = "Lista{{" +
                "size=" + size +"}";
        NodoLista n = cabeza;
        while(n!=null){
            aux = aux + ", " + n.getValor().toString();
            n = n.getNext();
        }
        return aux + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NodoLista actual = cabeza;
        Lista a = new Lista();
        NodoLista anterior = (NodoLista) actual.clone();
        a.cabeza = anterior;
        actual = actual.getNext();
        while(actual != null){
            anterior.setNext((NodoLista) actual.clone());
            anterior = anterior.getNext();
            actual = actual.getNext();
        }
        a.size = this.size;
        a.cola = anterior;
        return a;
    }
}


class NodoLista implements Cloneable{
    
    private NodoLista next;
    private Entero valor;

    public NodoLista(Entero valor) {
        this.valor = valor;
    }

    public NodoLista(NodoLista next, Entero valor) {
        this.next = next;
        this.valor = valor;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

    public Entero getValor() {
        return valor;
    }

    public void setValor(Entero valor) {
        this.valor = valor;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new NodoLista((Entero) valor.clone());
    }
}

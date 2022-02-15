public interface Pila {
    public Object pop()throws Exception;
    public void push(Entero e)throws Exception;
    public String toString();
    public Object clone()throws CloneNotSupportedException;
    public static final int TAM_MAX = 10;
    public boolean hasNext();
}

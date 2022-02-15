public class EnteroPrueba implements Cloneable{
    private int valor;

    public EnteroPrueba(int valor) {
        this.valor = valor;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }


}

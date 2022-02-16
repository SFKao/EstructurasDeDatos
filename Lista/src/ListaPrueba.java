public class ListaPrueba {
    public static void main(String[] args) throws CloneNotSupportedException {
        Lista a = new Lista();
        a.addFinal(new Entero(1));
        a.addFinal(new Entero(2));
        a.addInicio(new Entero(3));
        a.addInicio(new Entero(4));
        a.addFinal(new Entero(7));

        System.out.println(a);

        System.out.println(a.remove(2));
        System.out.println(a);

        System.out.println(a.get(0));

        System.out.println(a.clone());
    }
}

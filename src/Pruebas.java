public class Pruebas {

    public static void main(String[] args) {
        Pila p = new Pila();

        p.push(new Entero(2));
        p.push(new Entero(3));
        p.push(new Entero(4));
        System.out.println(p);
        try {
            System.out.println(p.clone());
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }

}

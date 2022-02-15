public class Pruebas {

    public static void main(String[] args) {
        PilaPrueba p = new PilaPrueba();

        p.push(new EnteroPrueba(2));
        p.push(new EnteroPrueba(3));
        p.push(new EnteroPrueba(4));
        System.out.println(p);
        try {
            System.out.println(p.clone());
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }

}

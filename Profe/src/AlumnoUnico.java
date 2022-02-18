import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class AlumnoUnico {

    public static void main(String[] args) {
        ArrayList<AlumnoUnico> a = new ArrayList<>();
        a.add(new AlumnoUnico("Jose"));
        a.add(new AlumnoUnico("Santi"));
        a.add(new AlumnoUnico("Loco"));
        a.add(new AlumnoUnico("Mewtwo"));
        a.add(new AlumnoUnico("Intellij"));

        System.out.println("get AlumnoUnico 2");
        System.out.println(a.get(2));
        System.out.println("\n--------------------------\nimprimir con for");
        for(int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));
        int index = 0;
        System.out.println("\n--------------------------\nimprimir con while");
        while (index < a.size()){
            System.out.println(a.get(index));
            index++;
        }
        System.out.println("\n--------------------------\nimprimir con iterator");
        Iterator<AlumnoUnico> it = a.iterator();
        while(it.hasNext()){
            AlumnoUnico aux = it.next();
            System.out.println(aux);
        }
        System.out.println("\n--------------------------\ncontains");
        System.out.println(a.contains(new AlumnoUnico("Loco")));
    }


    private String nombre;

    public AlumnoUnico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlumnoUnico AlumnoUnico = (AlumnoUnico) o;
        return Objects.equals(nombre, AlumnoUnico.nombre);
    }

    @Override
    public int hashCode() {
        return this.nombre.length() * nombre.charAt(0) * (nombre.charAt(1)*nombre.charAt(1));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new AlumnoUnico(this.nombre);
    }

    @Override
    public String toString() {
        return "AlumnoUnico{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}


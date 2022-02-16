import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Alumno {

    public static void main(String[] args) {
        ArrayList<Alumno> a = new ArrayList<>();
        a.add(new Alumno("Jose"));
        a.add(new Alumno("Santi"));
        a.add(new Alumno("Loco"));
        a.add(new Alumno("Mewtwo"));
        a.add(new Alumno("Intellij"));

        System.out.println("get Alumno 2");
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
        Iterator<Alumno> it = a.iterator();
        while(it.hasNext()){
            Alumno aux = it.next();
            System.out.println(aux);
        }
        System.out.println("\n--------------------------\ncontains");
        System.out.println(a.contains(new Alumno("Loco")));
    }


    private String nombre;

    public Alumno(String nombre) {
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
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}


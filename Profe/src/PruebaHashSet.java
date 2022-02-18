import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PruebaHashSet {
    public static void main(String[] args) throws CloneNotSupportedException {
        pruebaHashSetAlumnosUnicos();
    }


    /**
     * SetHash es una coleccion de elementos, NO DUPLICADOS.
     * Lo que hace es utilizar un Hash.
     */
    public static void pruebaHashSetFrutas(){
        Set<String> conjunto = new HashSet<>();
        conjunto.add("manzana");//añadimos un objeto
        conjunto.add("pera");
        conjunto.add("fresa");
        //intento añadir un repe
        conjunto.add("fresa");

        for(String f : conjunto)
            System.out.println(f);

        espacio();

        conjunto.remove("fresa");
        for(String f : conjunto)
            System.out.println(f);


    }

    public static void pruebaHashMapFrutas(){
        Map<String, String> map = new HashMap<>();
        map.put("c1", "manzana");
        map.put("c2","pera");
        map.put("c3","manzana");
        map.put("c4","un tanque");
        map.put("c2","santi");

        System.out.println(map.keySet());

        for (String key: map.keySet()) {
            System.out.println(key + "," + map.get(key));
        }

        System.out.println(map.getOrDefault("c2", "No esta"));


    }

    public static void pruebaHashSetAlumnos() throws CloneNotSupportedException {
        Alumno a1 = new Alumno("A");
        Alumno a2 = new Alumno("B");
        Alumno a3 = new Alumno("C");
        Alumno a4 = new Alumno("D");

        HashSet<Alumno> a = new HashSet<>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);

        a.add((Alumno) a1.clone()); //deja

        System.out.println(a);
    }

    public static void pruebaHashSetAlumnosUnicos() throws CloneNotSupportedException {
        AlumnoUnico a1 = new AlumnoUnico("AB");
        AlumnoUnico a2 = new AlumnoUnico("BD");
        AlumnoUnico a3 = new AlumnoUnico("CD");
        AlumnoUnico a4 = new AlumnoUnico("DE");

        HashSet<AlumnoUnico> a = new HashSet<>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);

        a.add((AlumnoUnico) a1.clone()); //deja

        System.out.println(a);
    }

    public static void espacio(){
        System.out.println("\n---------------------------\n");
    }
}

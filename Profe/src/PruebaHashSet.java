import java.util.*;

public class PruebaHashSet {
    public static void main(String[] args) throws CloneNotSupportedException {
        pruebaHashMapAlumnos();
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
        System.out.println("ITERATOR TIME");
        Iterator<AlumnoUnico> it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void pruebaHashMapAlumnos(){
        Alumno a1 = new Alumno("A");
        Alumno a2 = new Alumno("B");
        Alumno a3 = new Alumno("C");
        Alumno a4 = new Alumno("D");

        Map<Alumno, Alumno> personas = new HashMap<Alumno, Alumno>();
        personas.put(a1,a1);
        personas.put(a2,a2);
        personas.put(a3,a3);
        personas.put(a4,a4);

        System.out.println(personas.size());

        Iterator i = personas.values().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        espacio();
        for (Alumno key:personas.keySet()) {
            System.out.println(personas.get(key));
        }

        i = personas.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry e = (Map.Entry) i.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }

        for (Map.Entry er : personas.entrySet()){
            System.out.println(er);
        }
    }

    public static void espacio(){
        System.out.println("\n---------------------------\n");
    }
}

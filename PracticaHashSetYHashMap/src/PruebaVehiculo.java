import java.util.*;

public class PruebaVehiculo {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        HashSet<Vehiculo> brums = new HashSet<>();
        brums.add(new Vehiculo("774GST","Kia",12.5f,5));
        brums.add(new Vehiculo("249RTD","Mercedes",10.5f,6));
        brums.add(new Vehiculo("904PLM","Carrefour",3.5f,2));
        brums.add(new Vehiculo("435STB","Mercadona",2.5f,1));
        brums.add(new Vehiculo("1346HNB","Un tanque",17.5f,4));

        printColeccion(brums);
        espacio();

        System.out.println("Intento añadir un elemento que ya esta.");
        brums.add(new Vehiculo("774GST","Kia",12.5f,5));
        printColeccion(brums);
        System.out.println("Antes de poner el metodo Hash y Equals lo introduce.\nTras sobreescribir equals y hash no.");
        espacio();
        System.out.println("En printColeccion se recorre con iterator");
        espacio();
        System.out.println("Creacion de un HashMap");
        HashMap<String, Vehiculo> map = new HashMap<>();
        for (Vehiculo v:brums)
            map.put(v.getMatricula(),v);
        printColeccion(map);
        espacio();
        System.out.println("Intento introducir un vehiculo con la misma matricula");
        map.put("774GST",new Vehiculo("774GST","Cambio",2.4f,27));
        printColeccion(map);
        System.out.println("Ha reemplazado el vehiculo anterior con el nuevo");
        espacio();
        System.out.println("Introduce una matricula que buscar");
        if(map.containsKey(in.nextLine()))
            System.out.println("El vehiculo existe");
        else
            System.out.println("El vehiculo no existe");
        espacio();
        System.out.println("Introducimos vehiculos como clave y valores el precio");
        HashMap<Vehiculo,Double> mapa2 = new HashMap<>();
        double valor = 1000;
        for (Vehiculo v: map.values()) {
            mapa2.put(v,Double.valueOf(valor++));
        }
        printColeccion(mapa2);
        espacio();
        System.out.println("Probemos contains con un vehiculo que no existe");
        Vehiculo antiguo = new Vehiculo("1346HNB","Un tanque",17.5f,4);
        Vehiculo nuevo = new Vehiculo("ASDASDA","ASDASD",10.0f,4000);

        if(mapa2.containsKey(nuevo))
            System.out.println("El vehiculo existe");
        else
            System.out.println("El vehiculo no existe");
        System.out.println("Ahora con uno que existe");
        if(mapa2.containsKey(antiguo))
            System.out.println("El vehiculo existe");
        else
            System.out.println("El vehiculo no existe");
    }

    public static void printColeccion(Set c){
        Iterator it = c.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println();
    }

    public static void printColeccion(Map c){
        Iterator it = c.values().iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println();
    }

    public static void espacio(){
        System.out.println("\n-------------------------------\n");
    }
}

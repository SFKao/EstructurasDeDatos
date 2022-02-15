public class PruebaPila {
    public static void main(String[] args) {
        PilaConArray arr = new PilaConArray();
        PilaEnlace enl = new PilaEnlace();
        System.out.println("Insertando...");

        for(int i = 0; i < 12; i++){
            try{
                enl.push(new Entero(i)); //una pila con enlaces no tiene tamaño maximo
                arr.push(new Entero(i)); //pero una con array si hara saltar la excepcion
            }catch (Exception e){
                System.out.println(e + ", i = " + i);
            }
        }
        System.out.println("\n------------------------------------\n");
        System.out.println("Imprimiendo los valores de enlace..");
        for(int i = 0; i < 13; i++){
            try{
                System.out.println(enl.pop());
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("\n------------------------------------\n");
        System.out.println("Imprimiendo los valores de array...");
        for(int i = 0; i < 13; i++){
            try {
                System.out.println(arr.pop());
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("\n------------------------------------\n");
        System.out.println("Insertando 3 valores para toString y clone");
        for(int i = 0; i < 3; i++){
            try{
                arr.push(new Entero(i));
                enl.push(new Entero(i));
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("\n------------------------------------\n");
        System.out.println("Imprimiendo las pilas y tras ello sus clones");
        try {
            System.out.println(arr);
            System.out.println(arr.clone());

            System.out.println(enl);
            System.out.println(enl.clone());
        }catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("\n------------------------------------\n");
        System.out.println("Buscando elemento 1");
        System.out.println(enl.buscar(new Entero(1)));
    }
}
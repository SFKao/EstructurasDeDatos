public class PruebaPila {
    public static void main(String[] args) {
        PilaConArray arr = new PilaConArray();
        PilaEnlace enl = new PilaEnlace();
        for(int i = 0; i < 12; i++){
            try{
                enl.push(new Entero(i)); //una pila con enlaces no tiene tamaño maximo
                arr.push(new Entero(i)); //pero una con array si hara saltar la excepcion
            }catch (Exception e){
                System.out.println(e);
            }
        }

        for(int i = 0; i < 13; i++){
            try {
                System.out.println(arr.pop());
            }catch (Exception e){
                System.out.println(e);
            }
            try{
                System.out.println(enl.pop());
            }catch (Exception e){
                System.out.println(e);
            }
        }

        for(int i = 0; i < 3; i++){
            try{
                arr.push(new Entero(i));
                enl.push(new Entero(i));
            }catch (Exception e){
                System.out.println(e);
            }
        }

        try {
            System.out.println(arr);
            System.out.println(arr.clone());

            System.out.println(enl);
            System.out.println(enl.clone());
        }catch(Exception e) {
            System.out.println(e);
        }

        System.out.println(enl.buscar(new Entero(1)));
    }
}

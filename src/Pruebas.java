public class Pruebas {

    public static void main(String[] args) {
        Pila p = new Pila();

        p.push(Integer.valueOf(2));
        p.push(Integer.valueOf(3));
        p.push(Integer.valueOf(4));

        System.out.println(p);

        while(p.hasNext()){
            try{
                System.out.println(p.pop());
            }catch (NoHayElementoEnLaPila e){
                System.out.println(e);
            }
        }

        try{
            System.out.println(p.pop());
        }catch (NoHayElementoEnLaPila e){
            System.out.println(e);
        }
    }

}

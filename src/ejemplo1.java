

public class ejemplo1 {
    public static void main(String[] args) {

        int x=0;
        String nombre="Cesar";
        int y=nombre.length();


        while (x<y){

            System.out.println(nombre.substring((x),x+1));

            x++;

        }


    }
}

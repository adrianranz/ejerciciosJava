import java.util.ArrayList;
import java.util.Collections;

public class Ejerci3 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja = new ArrayList<>();
        for (int i = 0; i <= 13; i++) {
            baraja.add(i+1);
        }

        System.out.println("Orden normal");
        System.out.println(baraja);
        

        Collections.reverse(baraja);
        System.out.println("Orden inverso");
        System.out.println(baraja);
        

        Collections.shuffle(baraja);
        System.out.println("Orden aleatorio");
        System.out.println(baraja);
        
    }
}

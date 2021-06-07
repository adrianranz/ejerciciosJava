import java.util.Scanner;
import java.util.ArrayList;
public class Ejerci {
    public static void main(String[] args) {
              
        Scanner scan = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();
        System.out.print("cuantas ciudades desea agregar?: ");
        int cant= scan.nextInt();

        System.out.print("Ingrese el nombre de la ciudad: ");
        for(int i = 0; i <= cant; i++){
            
            ciudades.add(scan.nextLine());    
        }

        System.out.println("Sus ciudades favoritas son: ");
        for (int i = 1; i <ciudades.size(); i++) {
            System.out.println("#" + (i) + " - " + ciudades.get(i));
        }
        scan.close();
    }

}

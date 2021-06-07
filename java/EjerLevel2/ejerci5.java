import java.util.ArrayList;
import java.util.Scanner;

public class ejerci5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] semana = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> araay2 = new ArrayList<>();
        ArrayList<Integer> arraySueldo = new ArrayList<>();
        int cant = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(semana[i]);
            System.out.print("horas trabajada segun dia: ");
            array1.add(scanner.nextInt());
            System.out.print("Ingrese el precio por cada hora: ");
            araay2.add(scanner.nextInt());
        }
        scanner.close();

        
        for (int i = 0; i < 5; i++) {
            arraySueldo.add(array1.get(i) * araay2.get(i));
        }

        
        for (int i = 0; i < 5; i++) {
            cant += arraySueldo.get(i);
            
        }

        System.out.print("sueldo semanal: $" + cant);
    }
    
}

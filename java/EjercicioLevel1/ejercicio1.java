import java.util.Scanner;
public class ejercicio1 {
    public static void main(String [] args){
        System.out.println("ingrese un nombre :");
        Scanner scan= new Scanner(System.in);
        String nombre = scan.nextLine();
        scan.close();
        System.out.println("HOLA"+ nombre);
    }
}

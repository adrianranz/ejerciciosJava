package ejercicio8;
import java.util.Scanner;

public class principal {
    public static void main(String [] args){
        System.out.println("ingrese los datos de la persona.");
        Scanner scan= new Scanner(System.in);

        Persona datos = new Persona(1, " "," ", " ");
        
        datos.edad = scan.nextInt();
        datos.nomYape = scan.nextLine();
        datos.direccion = scan.nextLine();
        datos.ciudad = scan.nextLine();
        
        scan.close();

        System.out.println("los datos son: ");
        System.out.println(datos.toString());
    }
}

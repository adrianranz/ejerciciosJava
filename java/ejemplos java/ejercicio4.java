import java.util.Scanner;
public class ejercicio4 {
    public static void main(String [] args){
        System.out.println("del 1 al 7 ingrese un numero :");
        Scanner scan= new Scanner(System.in);
        int dia = scan.nextInt();
        scan.close();

        if (dia == 1){
            System.out.println("hoy es domingo.");

        } else if ( dia == 2){
            System.out.println("hoy es lunes.");

        }else if ( dia == 3){
            System.out.println("hoy es martes.");
            
        }else if ( dia == 4){
            System.out.println("hoy es miercoles.");

        }else if ( dia == 5){
            System.out.println("hoy es jueves.");

        }else if ( dia == 6){
            System.out.println("hoy es viernes.");

        }else {
            System.out.println("hoy es sabado");
        }

    }
}


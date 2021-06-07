import java.util.Scanner;
public class ejer4{
    public static void main(String [] args){
        System.out.println("ingrese 1 numero :");

        Scanner scan= new Scanner(System.in);
        int numero2 = scan.nextInt();
        scan.close();
        int factorial=1;
        int numero=numero2;
        
        while(numero != 0){
            factorial=factorial*numero;
            numero--;
        }
        
        System.out.println("la factorial de " + numero2 + " es igual a: "+factorial);

    }
}

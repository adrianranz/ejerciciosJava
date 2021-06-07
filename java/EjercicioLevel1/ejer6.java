import java.util.Scanner;
public class ejer6 {
    public static void main(String [] args){
        System.out.println("ingrese 2 numeros :");

        Scanner scan= new Scanner(System.in);
        int numero = scan.nextInt();
        int numero2 = scan.nextInt();
        scan.close();
        int potencia=1;

        for(int i=0 ; i < numero2 ; i++){
           potencia = potencia * numero;
        }
        
        System.out.println("el resultado es :" +potencia);
    }   

}

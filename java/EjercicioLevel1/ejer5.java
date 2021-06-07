import java.util.Scanner;
public class ejer5 {
    public static void main(String [] args){
        System.out.println("ingrese 2 numeros :");

        Scanner scan= new Scanner(System.in);
        int numero = scan.nextInt();
        int numero2 = scan.nextInt();
        scan.close();
        int mul=0;

        for(int i=0 ; i < numero2 ; i++){
           mul += numero;
        }
        
        System.out.println("el resultado es :" +mul);
    }   

}

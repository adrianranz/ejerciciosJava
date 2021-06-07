import java.util.Scanner;
public class ejer2{
    public static void main(String [] args){
        System.out.println("ingrese 2 numeros enteros :");

        Scanner scan= new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        scan.close();

        int suma = A+B;
        int resta = A-B;
        int div = A/B;
        int mul = A*B;
        int mod = A%B;

        System.out.println(A +"+"+ B +"=" + suma);
        System.out.println(A +"-"+ B +"=" + resta);
        System.out.println(A +"/"+ B +"=" + div);
        System.out.println(A +"*"+ B +"=" + mul);
        System.out.println(A +"%"+ B +"=" + mod);
    }
}

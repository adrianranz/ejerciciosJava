import java.util.Scanner;
public class ejercicio5 {
    

public static void main(String [] args){
    System.out.println("ingrese un numero :");
    Scanner scan= new Scanner(System.in);
    int numero = scan.nextInt();
    scan.close();

    for(int i = 1; i<=10; i++){
        System.out.println(numero + " * " + i + "=" + numero*i);
    }
}
}
import java.util.Scanner;
public class ejer3 {
    public static void main(String [] args){
        System.out.println("ingrese 1 numero entero :");

        Scanner scan= new Scanner(System.in);
        int A = scan.nextInt();
        scan.close();
        StringBuilder print = new StringBuilder();

        for (int i = 1; i<=A; i++){
            print.append(String.valueOf(i));
            System.out.println(print + "\n");
        }
    }
}

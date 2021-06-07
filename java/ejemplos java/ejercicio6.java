import java.util.Scanner;
public class ejercicio6 {
    public static void main(String [] args){
        
    Scanner scan= new Scanner(System.in);
    int continuar = 1;
    int numero;
        
        while(continuar == 1){
            
            System.out.println("ingrese un numero :");
            numero = scan.nextInt();
            System.out.println("el numero es :"+numero);
            System.out.println("desea continuar? S=1 N=2");
            continuar = scan.nextInt();
        }
        scan.close();
        System.out.println("termino el programa");
    }   
        
}

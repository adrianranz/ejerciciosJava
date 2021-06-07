import java.util.Scanner;
public class ejer7 {
    public static void main(String [] args){
        System.out.println("ingrese 1 palabra :");
        Scanner scan= new Scanner(System.in);
        String palabra = scan.nextLine();
        scan.close();
        
        for (int i = 0; i< palabra.length(); i++)
            {
                char aChar = palabra.charAt(i);
                if (97 <= aChar && aChar<=122)
                {
                    aChar = (char)( (aChar - 32) ); 
                }
                System.out.print(aChar);
            }
        }
}

import java.util.ArrayList;
import java.util.List;
public class ejerci4 {
    public static void main(String[] args) {
        ArrayList<String> estudiante = new ArrayList<>();

        estudiante.add("estudiante 1");
        estudiante.add("estudiante 2");
        estudiante.add("estudiante 3");
        estudiante.add("estudiante 4");
        estudiante.add("estudiante 5");
        estudiante.add("estudiante 6");
        estudiante.add("estudiante 7");
        estudiante.add("estudiante 8");
        estudiante.add("estudiante 9");
        estudiante.add("estudiante 10");
        estudiante.add("estudiante 11");
        estudiante.add("estudiante 12");

        List<String> curso1 = estudiante.subList(0,4);
        List<String> curso2 = estudiante.subList(4,8);
        List<String> curso3 = estudiante.subList(8, estudiante.size());

       
        System.out.println("Primer curso");
        System.out.println(curso1);
        
        System.out.println("Segundo curso");
        System.out.println(curso2);
        
        System.out.println("Tercer curso");
        System.out.println(curso3);
        
    }
}

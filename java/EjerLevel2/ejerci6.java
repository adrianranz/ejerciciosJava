import java.util.HashMap;
import java.util.HashSet;

public class ejerci6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleado = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();

        empleado.add(new Empleado("Empleado 1", 85532142, 1, 99654));
        empleado.add(new Empleado("Empleado 2", 46632223, 2, 54233));
        empleado.add(new Empleado("Empleado 3", 12553232, 3, 56432));
        empleado.add(new Empleado("Empleado 4", 99656525, 6, 11225));

        for (Empleado e : empleado) {
            sueldo.put(e.getDni(), e.getsueldo());
        }

        sueldo.forEach((dni, sueldo) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + sueldo));
    }
}

class Empleado {
    String name;
    int dni;
    float workHours;
    float pricePerHour;

    public Empleado(String name, int dni, float workHours, float pricePerHour) {
        this.name = name;
        this.dni = dni;
        this.workHours = workHours;
        this.pricePerHour = pricePerHour;
    }

    public int getDni() {
        return dni;
    }

    public float getsueldo() {
        return this.workHours * this.pricePerHour;
    }
}

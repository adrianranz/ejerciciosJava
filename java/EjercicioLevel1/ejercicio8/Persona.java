package ejercicio8;

public class Persona {
    
    int edad;
    String nomYape;
    String direccion;
    String ciudad;

    public Persona(int edad, String nomYape, String direccion, String ciudad ){
        this.edad= edad;
        this.nomYape = nomYape;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return String.valueOf(this.edad) +
            " - " + this.nomYape +
            " - " + this.direccion +
            " - " + this.ciudad;      
    }
}

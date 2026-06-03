package miproyecto.appPersona;
public class Persona{

    private int edad;
    private String nombre;
    private String puesto;
    private double salario;
    private static final double impuestos = 0.21;

    public Persona(int edad, String nombre, String puesto, double salario){
        this.edad = edad;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

    }

    public String describir(){
        return "Edad: " + edad + ", Nombre: " + nombre + ", Puesto: " + puesto; 
    }

    public double calcularNeto(){
        double neto = this.salario * (1-impuestos);
        return neto;
    }


}
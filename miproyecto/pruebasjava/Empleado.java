package miproyecto.pruebasjava;

/*Crea la clase abstracta Empleado con nombre, dni y salarioBase. Subclases: 
EmpleadoFijo (calcula nomina con trienios), EmpleadoTemporal (calcula nomina por 
horas), EmpleadoComercial (salario base + comision sobre ventas). Metodo abstracto 
calcularNomina(). Crea un ArrayList<Empleado> y genera el recibo de nominas. */

public abstract  class Empleado {
    protected String dni;
    protected String nombre;
    protected double salarioBase;

    public Empleado(String dni, String nombre, double salarioBase){
        this.dni = dni;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularNomina();
}

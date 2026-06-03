package miproyecto.pruebasjava;

/*Crea la clase abstracta Empleado con nombre, dni y salarioBase. Subclases: 
EmpleadoFijo (calcula nomina con trienios), EmpleadoTemporal (calcula nomina por 
horas), EmpleadoComercial (salario base + comision sobre ventas). Metodo abstracto 
calcularNomina(). Crea un ArrayList<Empleado> y genera el recibo de nominas. */

public class EmpleadoFijo extends Empleado {

    public EmpleadoFijo(String dni, String nombre, double salarioBase){

        super(dni, nombre, salarioBase);  

        }

    @Override public double calcularNomina(){
        salarioBase *=3;
        return salarioBase;   

    }

    
    public String tipoContrato(){
        return "Contrato Fijo";
    }
}

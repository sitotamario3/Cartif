package miproyecto.practicarpoo;

/*Crea dos clases que hereden de Vehiculo:

    Tanque
    — añade atributo privado
    calibreCañon
    (int, en mm). Su método
    describir()
    debe llamar al de la clase padre con
    super.describir()
    y luego imprimir:
    "Cañón: [x]mm"
    DroneVigilancia
    — añade atributo privado
    alcanceKm
    (int). Su
    describir()
    llama al padre y añade:
    "Alcance de vigilancia: [x] km"
    Ambas clases deben tener su propio constructor que use
    super(...)
    para inicializar los atributos heredados

Tanque t = new Tanque("Leopard 2", 72, 10, 120);
t.describir();
// Vehículo: Leopard 2 | Vel. máx: 72 km/h | Blindaje: 10/10
// Cañón: 120mm

DroneVigilancia d = new DroneVigilancia("Heron", 220, 2, 350);
d.describir();
// Vehículo: Heron | Vel. máx: 220 km/h | Blindaje: 2/10
// Alcance de vigilancia: 350 km */

public class DroneVigilancia extends Vehiculo {

    private int alcanceKm;

    public DroneVigilancia(String nombre, int velocidadMaxima, int blindaje, int alcanceKm){

        super(nombre, velocidadMaxima, blindaje);

        this.alcanceKm = alcanceKm;

    }

    @Override
    public void describir() {
        
        System.out.println("Drone: " + getNombre() + ". Alcance de vigilancia: "+ alcanceKm +" km");

    }

    public static void main(String[] args) {
        DroneVigilancia d = new DroneVigilancia("Heron", 220, 2, 350);
        d.describir();
    }

    
    
}

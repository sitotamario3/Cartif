package miproyecto.practicarpoo;
import java.util.ArrayList;

/*Fase 3Polimorfismo y abstracción

Ahora generaliza el diseño usando una clase abstracta y polimorfismo.

    Convierte
    Vehiculo
    en
    abstract
    y declara
    describir()
    como método abstracto (elimina su implementación)
    Crea una interfaz
    Desplegable
    con un método
    desplegar()
    que no devuelva nada
    Haz que
    Tanque
    implemente
    Desplegable
    — su
    desplegar()
    imprime:
    "Tanque [nombre] desplegado en posición de combate"
    En el
    main
    , crea un
    ArrayList<Vehiculo>
    con un
    Tanque
    y un
    DroneVigilancia
    , recórrelo con un bucle y llama a
    describir()
    en cada uno — observa el polimorfismo en acción

ArrayList<Vehiculo> flota = new ArrayList<>();
flota.add(new Tanque("Leopard 2", 72, 10, 120));
flota.add(new DroneVigilancia("Heron", 220, 2, 350));

for (Vehiculo v : flota) {
    v.describir(); // cada uno ejecuta SU versión
}
💡 El punto clave de la fase 3: el bucle no sabe si cada objeto es un Tanque o un Drone — sólo sabe que son Vehiculos. Java decide en tiempo de ejecución qué versión de describir() ejecutar. Eso es polimorfismo.*/

public class AppVehiculos {

    public static void main(String[] args) {
        ArrayList<Vehiculo>  vehiculos = new ArrayList<>();

        vehiculos.add(new Tanque("Leopard 2", 72, 10, 120));
        vehiculos.add(new DroneVigilancia("Heron", 220, 2, 350));

        for (Vehiculo v : vehiculos){
            v.describir();
        }
    }
    
}

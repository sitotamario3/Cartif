package miproyecto.practicarpoo;



public abstract class Vehiculo {

    private String nombre;
    private  int velocidadMaxima;
    private int blindaje;


    public Vehiculo(String nombre, int velocidadMaxima, int blindaje){
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
        this.blindaje = blindaje;
    }

    public String getNombre(){
        return nombre;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public int getBlindaje(){
        return blindaje;
    }

    public abstract void describir();

    

    
}

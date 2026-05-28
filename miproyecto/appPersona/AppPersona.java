package miproyecto;
public class AppPersona{
    
    public static void main (String[] args){

            Persona sito = new Persona(21, "Sito", "Desarrollador", 1500);

        System.out.println(sito.describir());
        System.out.println(sito.calcularNeto());
    }
}
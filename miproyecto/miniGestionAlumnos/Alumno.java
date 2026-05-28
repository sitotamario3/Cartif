import java.util.ArrayList;

class Alumno{
    private String nombre;
    private String dni;

    public Alumno(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String buscarDNI(){
        return this.dni;
    }

    public void eliminarAlumno(){
        
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", dni= " + dni;
    }



    public static void main(String[] args) {

        Alumno pablo = new Alumno("Pablo", "1");
        Alumno jesus = new Alumno("Jesus", "2");
        Alumno lucas = new Alumno("Lucas", "3");
        Alumno sara = new Alumno("Sara", "4");
        Alumno carla = new Alumno("Carla", "5");
        Alumno sito = new Alumno("Sito", "6");
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(pablo);
        alumnos.add(jesus);
        alumnos.add(lucas);
        alumnos.add(sara);
        alumnos.add(carla);
        alumnos.add(sito);

        for (Alumno alumno : alumnos){
            System.out.println(alumno.toString());
        }

        System.out.println(sito.buscarDNI());

    }
    
}
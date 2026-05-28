

class Alumno{
    private String nombre;
    private String dni;
    private int numeroMatricula = 0;

    public Alumno(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public void matricular(){
        numeroMatricula ++;
    }

    public String getAlumno(){
        return "Nombre: " + this.nombre + ", dni: " + dni;
    }
}
class Estudiante{
    private String nombre;
    private double[] notas;

    public Estudiante(String nombre, double[] notas){
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public double calcularPromedio(){
        double suma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            suma += this.notas[i];
        }
        double media = suma / this.notas.length;
        return media;
    }

    public boolean hasAprobado(){
        if(calcularPromedio() >= 5){
            return true;
        } else{
            return false;
        }
    }
}
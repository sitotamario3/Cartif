class AppGestionNotas{

    public static void main(String[] args) {
        double[] notas = {0.5, 8.0, 4.2};

        Estudiante sito = new Estudiante("Sito", notas);

        // Esto reemplaza todo tu bloque if-else de 'aprobado'
        String aprobado = sito.hasAprobado() ? "Sí" : "No";

        System.out.println("El estudiante " + sito.getNombre() + " tiene un promedio de " + sito.calcularPromedio() + 
        ". ¿Está aprobado? " + aprobado);
    }
}
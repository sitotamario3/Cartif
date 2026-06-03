


import java.util.Scanner;

class AppRectangulo{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Por favor introduce el ancho del rectángulo: ");
        double ancho = sc.nextDouble();
        System.out.println("Por favor introduce el alto del rectángulo: ");
        double alto = sc.nextDouble();

        Rectangulo usuario = new Rectangulo(ancho, alto);

        System.out.println("El area del rectángulo es: " + usuario.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + usuario.calcularPerimetro());


        sc.close();
    }
}
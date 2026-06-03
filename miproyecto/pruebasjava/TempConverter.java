package miproyecto.pruebasjava;
/**
 * DESCRIPTION:
 * This app is meant to take an array of temperatures in Fahrenheit,
 * convert each temperature to Celsius using the formula: C = (F - 32) * (5/9),
 * store the converted values in a new array, and print them out.
 */
public class TempConverter {
    public static void main(String[] args) {
        double[] fahrenheitTemps = {32.0, 68.0, 100.0, 212.0};
        double[] celsiusTemps = new double[fahrenheitTemps.length];

        for (int i = 0; i < fahrenheitTemps.length; i++) {
            double f = fahrenheitTemps[i];
            celsiusTemps[i] = (f - 32) * (5 / (double)9);
            
        }

        System.out.println("Converted Temperatures in Celsius:");
        for (double c : celsiusTemps) {
            System.out.println(c + " ");
        }
    }
}
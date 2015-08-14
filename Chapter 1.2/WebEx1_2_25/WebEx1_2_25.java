public class WebEx1_2_25 {
    public static void main (String[] args) {
        // Given the temperature t (in Fahrenheit) and the wind speed v 
        // (in miles per hour), the National Weather Service defines the effective 
        // temperature (the wind chill) to be: w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v0.16
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double windchill = 35.74 + .6215*t + (.4275 * t - 35.75) * Math.pow(v,.16);
        System.out.print(windchill);
    }
}
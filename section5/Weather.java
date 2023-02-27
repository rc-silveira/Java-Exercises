public class Weather {
    public static void main(String[] args) {

        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);

        for (int i = 0; i < celsius.length; i++) {

            System.out.println(fahrenheit[i]);
            
        }

        
    }

    public static double[] celsiusToFahrenheit(double [] celsius){

        double [] farenheit = new double [celsius.length];
        for (int i = 0; i < celsius.length; i++) {
            farenheit[i] = (celsius[i]/5 * 9)+32;
        }

        return farenheit;
        
    }
    
}

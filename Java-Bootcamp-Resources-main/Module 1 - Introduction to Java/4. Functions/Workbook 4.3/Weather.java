public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        System.out.println(fahrenheitToCelsius(noon));
        System.out.println(fahrenheitToCelsius(evening));
        System.out.println(fahrenheitToCelsius(midnight));
        
    }
 
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32) * 5/9;

    }
    

   
}

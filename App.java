import java.util.Scanner;


public class App {

    private static final Scanner inputScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
            
        new App();
            Calculator calc = new Calculator();
            
            String sprompt  = ("enter a digit: "); 
            String dprompt = ("enter a digit: ");

            double num1 = App.getDouble(dprompt);
            double num2 = App.getDouble(dprompt);

            System.out.println();
            
            double addresult = calc.add(num1, num2);
            double subresult = calc.subtract(num1, num2);
            double multesult = calc.multiply(num1, num2);
            double divtesult = calc.divide(num1, num2);


            System.out.println("addition result: " + addresult);
            System.out.println("subtraction result: " + subresult);
            System.out.println("multiplication result: " + multesult);
            System.out.println("divide result: " + divtesult);



            // removed  String message = String.format("want to add %.2f and %.2f", num1, num2);
            // System.out.println(message);
    }
     
    private static String getString(String prompt) {
            System.out.print(prompt);
            String input0 = inputScanner.nextLine();
            return input0;
        }

    private static double getDouble(String prompt) {
            System.out.print(prompt);
            Double input1 = inputScanner.nextDouble();
            return input1;
         }
}



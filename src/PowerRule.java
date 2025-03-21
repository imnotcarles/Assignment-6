import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Please enter the coefficients:");
        String coefficients = keyboard.nextLine();
        System.out.println("Please enter the degrees:");
        String degrees = keyboard.nextLine();
        keyboard.close();

        String[] coeff = coefficients.split(" ");
        String[] deg = degrees.split(" ");
        
    }
}
import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String firstDerivative = "f'(x) = ";
        String secondDerivative = "f''(x) = ";

        System.out.println("Please enter the coefficients of a polynomial's terms: ");
        String coefficients = keyboard.nextLine();
        System.out.println("Please enter the degrees of a polynomial's terms: ");
        String exponents = keyboard.nextLine();
        keyboard.close();

        String[] coeff = coefficients.split(" ");
        String[] exp = exponents.split(" ");
        double[] coeff2 = new double[coeff.length];
        int[] exp2 = new int[exp.length];

        for (int i = 0; i < coeff.length; i++) {
            double coefficient = Double.parseDouble(coeff[i]) * Integer.parseInt(exp[i]);
            int exponent = Integer.parseInt(exp[i]) - 1;
            if (exponent > 0) {
                firstDerivative += (coefficient > 0 && i > 0 ? " +" : " ") + coefficient + "x^" + exponent;
                exp2[i] = exponent;
                coeff2[i] = coefficient;
            } else if (coefficient != 0) {
                firstDerivative += (coefficient > 0 && i > 0 ? " +" : " ") + coefficient;
            }
        }

        for (int i = 0; i < coeff2.length; i++) {
            double coefficient = coeff2[i] * exp2[i];
            int exponent = exp2[i] - 1;
            if (exponent > 0) {
                secondDerivative += (coefficient > 0 && i > 0 ? " +" : " ") + coefficient + "x^" + exponent;
            } else if (coefficient != 0) {
                secondDerivative += (coefficient > 0 && i > 0 ? " +" : " ") + coefficient;
            }
        }
        System.out.println("Your first derivative is: " + firstDerivative);
        System.out.println("Your second derivative is: " + secondDerivative);
    }
}
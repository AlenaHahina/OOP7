package DZ_7_OOP;


public class Main {
    public static void main(String[] args) {
        Calculator additionCalculator = new Calculator(new Addition());
        double result1 = additionCalculator.calculate(500, 856); 
        Calculator multiplicationCalculator = new Calculator(new Multiplication());
        double result2 = multiplicationCalculator.calculate(5, 3); 
        Calculator divisionCalculator = new Calculator(new Division());
        double result3 = divisionCalculator.calculate(6, 3);
    }
}

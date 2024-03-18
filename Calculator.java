package DZ_7_OOP;

import java.util.logging.Logger;

public class Calculator {
    private static final Logger log = Logger.getLogger(Calculator.class.getName());
    
    private Operation operation;
    
    public Calculator(Operation operation) {
        this.operation = operation;
    }
    
    public double calculate(double a, double b) {
        double result = operation.apply(a, b);
        log.info(a + " " + operation.getClass().getSimpleName() + " " + b + " = " + result);
        return result;
    }
    }
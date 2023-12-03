package oop.oop_attestation_calculator.Model;

public class Division implements Operation {
    public double execute(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return a / b;
    }
}

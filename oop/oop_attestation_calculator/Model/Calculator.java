package oop.oop_attestation_calculator.Model;

import oop.oop_attestation_calculator.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final int MenuOperationsQuantity;
    private Operation operation;
    private final List<Observer> observers = new ArrayList<>();

    public Calculator(int MenuOperationsQuantity){
        this.MenuOperationsQuantity = MenuOperationsQuantity;
    }

    public int getMenuOperationsQuantity(){
        return  MenuOperationsQuantity;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public double calculate(double a, double b) {
        double result = operation.execute(a, b);
        for (Observer observer : observers) {
            observer.update(result);
        }
        return result;
    }
}

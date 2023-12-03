package oop.oop_attestation_calculator.View;

import oop.oop_attestation_calculator.Model.Calculator;

public interface View {
    void displayMenu();
    void displayResult(Calculator calculator, double a, double b);
    void choiceMenu(Calculator calculator, int choice);

}

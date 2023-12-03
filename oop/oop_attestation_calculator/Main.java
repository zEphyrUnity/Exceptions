package oop.oop_attestation_calculator;

import oop.oop_attestation_calculator.Controler.ConsoleExecuteController;
import oop.oop_attestation_calculator.Controler.Controller;
import oop.oop_attestation_calculator.Controler.ExecuteController;
import oop.oop_attestation_calculator.Model.Calculator;
import oop.oop_attestation_calculator.Observer.LogObserver;
import oop.oop_attestation_calculator.View.ConsoleView;
import oop.oop_attestation_calculator.View.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleView();
        Calculator calculator = new Calculator(4);
        calculator.addObserver(new LogObserver());
        ExecuteController executeController = new ConsoleExecuteController(calculator, view);
        Controller controller = new Controller(executeController);
        controller.execute();
    }
}
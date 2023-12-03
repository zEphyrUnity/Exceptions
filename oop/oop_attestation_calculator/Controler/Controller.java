package oop.oop_attestation_calculator.Controler;

public class Controller {
    ExecuteController executeController;

    public Controller(ExecuteController executeController) {
        this.executeController = executeController;
    }

    public void execute(){
        executeController.execute();
    }
}

package oop.oop_attestation_calculator.Observer;

import java.util.logging.Logger;

public class LogObserver implements Observer {
    private static final Logger logger = Logger.getLogger(LogObserver.class.getName());

    @Override
    public void update(double result) {
        System.out.println();
        logger.info("Результат вычислений: " + result);
    }
}

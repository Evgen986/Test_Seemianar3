package org.example.task1;

import org.example.task1.controllers.CalculatorController;
import org.example.task1.models.CalculatorModel;
import org.example.task1.views.CalculatorView;

public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        controller.run();
    }
}

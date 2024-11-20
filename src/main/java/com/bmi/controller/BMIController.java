package com.bmi.controller;

import java.util.Scanner;

import com.bmi.model.BMIModel;
import com.bmi.view.BMIView;

public class BMIController {
    private BMIModel model;
    private BMIView view;

    public BMIController(BMIModel model, BMIView view) {
        this.model = model;
        this.view = view;
    }

    public void calculateAndDisplayBMI() {
        double bmi = model.calculateBMI();
        String classification = model.classifyBMI(bmi);
        view.displayResult(bmi, classification);
    }
    
    public static void start(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMIView view = new BMIView();

        view.displayMessage("Bienvenido al calculador de IMC");
        view.displayMessage("Por favor, introduce tu peso en kilogramos:");
        double weight = scanner.nextDouble();
        view.displayMessage("Por favor, introduce tu altura en metros:");
        double height = scanner.nextDouble();

        BMIModel model = new BMIModel(weight, height);
        BMIController controller = new BMIController(model, view);

        controller.calculateAndDisplayBMI();
        scanner.close();
    }
}

package com.bmi.view;

public class BMIView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayResult(double bmi, String classification) {
        System.out.printf("Tu índice de masa corporal (IMC) es: %.2f\n", bmi);
        System.out.println("Clasificación: " + classification);
    }
}

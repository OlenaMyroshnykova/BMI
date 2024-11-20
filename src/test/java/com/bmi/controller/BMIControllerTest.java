package com.bmi.controller;

import org.junit.jupiter.api.Test;

import com.bmi.model.BMIModel;
import com.bmi.view.BMIView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BMIControllerTest {

    @Test
    public void testCalculateAndDisplayBMI_NormalWeight() {
        String input = "70\n1.75\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        BMIView view = new BMIView();
        Scanner scanner = new Scanner(System.in);

        view.displayMessage("Por favor, introduce tu peso en kilogramos:");
        double weight = scanner.nextDouble();

        view.displayMessage("Por favor, introduce tu altura en metros:");
        double height = scanner.nextDouble();

        BMIModel model = new BMIModel(weight, height);
        BMIController controller = new BMIController(model, view);
        controller.calculateAndDisplayBMI();

        String output = outputStream.toString();

        assertTrue(output.contains("Tu índice de masa corporal (IMC) es: 22.86"));
        assertTrue(output.contains("Clasificación: Peso normal"));
    }

    @Test
    public void testStart() {

        String simulatedInput = "70\n1.75\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        BMIController.start(new String[]{});

        String output = outputStream.toString();

        assertTrue(output.contains("Bienvenido al calculador de IMC"));
        assertTrue(output.contains("Tu índice de masa corporal (IMC) es: 22.86"));
        assertTrue(output.contains("Clasificación: Peso normal"));
    }
}

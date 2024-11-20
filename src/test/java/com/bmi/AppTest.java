package com.bmi;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testMain() {
       
        String simulatedInput = "70\n1.75\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        App.main(new String[]{});

        String output = outputStream.toString();

        assertTrue(output.contains("Bienvenido al calculador de IMC"));
        assertTrue(output.contains("Tu índice de masa corporal (IMC) es: 22.86"));
        assertTrue(output.contains("Clasificación: Peso normal"));
    }
}


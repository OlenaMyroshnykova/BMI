package com.bmi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BMIModelTest {

    @Test
    public void testCalculateBMI() {

        BMIModel model = new BMIModel(70, 1.75);

        double expectedBMI = 70 / (1.75 * 1.75);

        assertEquals(expectedBMI, model.calculateBMI(), 0.01, "ИМТ рассчитан неверно");
    }

    @Test
    public void testClassifyBMI_SevereThinness() {
        
        BMIModel model = new BMIModel(40, 1.75);
        double bmi = model.calculateBMI();

        assertEquals("Delgadez severa", model.classifyBMI(bmi), "Классификация для ИМТ < 16 неверна");
    }

    @Test
    public void testClassifyBMI_NormalWeight() {
       
        BMIModel model = new BMIModel(70, 1.75);
        double bmi = model.calculateBMI();

        assertEquals("Peso normal", model.classifyBMI(bmi), "Классификация для нормального веса неверна");
    }

    @Test
    public void testClassifyBMI_Overweight() {
       
        BMIModel model = new BMIModel(80, 1.75);
        double bmi = model.calculateBMI();

        assertEquals("Sobrepeso", model.classifyBMI(bmi), "Классификация для избыточного веса неверна");
    }

    @Test
    public void testClassifyBMI_MorbidObesity() {
        
        BMIModel model = new BMIModel(125, 1.75);
        double bmi = model.calculateBMI();

        assertEquals("Obesidad mórbida", model.classifyBMI(bmi), "Классификация для ожирения неверна");
    }
}


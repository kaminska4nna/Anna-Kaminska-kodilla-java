package com.kodilla.spring.calculator;

import com.kodilla.spring.com.kodilla.spring.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double resultAdd = calculator.add(4, 4);
        double resultDiv = calculator.div(4, 4);
        double resultMul = calculator.mul(4, 4);
        double resultSub = calculator.sub(4, 4);

        Assert.assertEquals(8, resultAdd, 0.0);
        Assert.assertEquals(1, resultDiv, 0.0);
        Assert.assertEquals(16, resultMul, 0.0);
        Assert.assertEquals(0, resultSub, 0.0);

    }
}

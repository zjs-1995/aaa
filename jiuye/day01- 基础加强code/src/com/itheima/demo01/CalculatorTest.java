package com.itheima.demo01;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void tsetCalculator() {
        Calculator c = new Calculator();
        int result = c.add(1, 3);
        Assert.assertEquals(4, result);
    }
}

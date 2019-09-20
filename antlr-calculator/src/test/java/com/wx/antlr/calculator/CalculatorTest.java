package com.wx.antlr.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xinquan.huangxq
 */
public class CalculatorTest {

    @Test
    public void calc() {
        Assert.assertEquals(Calculator.calc("3 * (5 + 3) - 2;"), 22);
        Assert.assertEquals(Calculator.calc("3 + 2 * 3 - 2;"), 7);
        Assert.assertEquals(Calculator.calc("a = 3 + 2 * 3 - 2; b = 3 * (5 + 3) - 2; a + b * 3;"), 73);
    }
}
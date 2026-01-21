package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTests {
    @Test
    public void areaOfCircleTest() {
        Assertions.assertEquals(28.27, AreaCalculator.getAreaOfCircle(3.0), 0.01);
    }

    @Test
    public void areaOfRectangleTest() {
        Assertions.assertEquals(12, AreaCalculator.getAreaOfRectangle(3.0, 4.0));
    }

    @Test
    public void areaOfTriangleTest() {
        Assertions.assertEquals(6, AreaCalculator.getAreaOfTriangle(3.0, 4.0));
    }

    // Test comment, ignore me!
}

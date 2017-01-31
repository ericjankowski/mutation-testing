package com.erj.practice.mutation.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
    private static final double PRECISION = Math.pow(10, -323);

    @Test
    public void trianglesHaveThreeSides() throws Exception {
        Triangle triangle = new Triangle();

        int numberOfSides = triangle.getNumberOfSides();
        assertEquals(3, numberOfSides);
    }

    @Test
    public void trianglesPerimeterIsTheSumOfTheLengthsOfItsEdges() throws Exception {
        Triangle triangle = new Triangle(1, 1, 1);

        double perimeter = triangle.getPerimeter();
        assertEquals(3.0, perimeter, PRECISION);
    }

    @Test
    public void getAreaCalculatesTheAreaOfTheTriangle() {
        Triangle triangle = new Triangle();

        double area = triangle.getArea();
        assertEquals(0.4330127018922193, area, PRECISION);
    }

    @Test
    public void throwIllegalArgumentExceptionWhenFirstSideIsTooLong() throws Exception {
        int side_a = 3;
        int side_b = 1;
        int side_c = 1;

        try {
            new Triangle(side_a, side_b, side_c);
            fail("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle");
        } catch (IllegalArgumentException e) {
            assertEquals("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle", e.getMessage());
        }
    }

    @Test
    public void throwIllegalArgumentExceptionWhenSecondSideIsTooLong() throws Exception {
        int side_a = 1;
        int side_b = 3;
        int side_c = 1;

        try {
            new Triangle(side_a, side_b, side_c);
            fail("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle");
        } catch (IllegalArgumentException e) {
            assertEquals("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle", e.getMessage());
        }
    }

    @Test
    public void throwIllegalArgumentExceptionWhenThirdSideIsTooLong() throws Exception {
        int side_a = 1;
        int side_b = 1;
        int side_c = 3;

        try {
            new Triangle(side_a, side_b, side_c);
            fail("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle");
        } catch (IllegalArgumentException e) {
            assertEquals("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle", e.getMessage());
        }
    }

    @Test
    public void throwIllegalArgumentExceptionWhenFirstSideIsEqualToTheSumOfTheOtherTwoSides() throws Exception {
        int side_a = 2;
        int side_b = 1;
        int side_c = 1;

        try {
            new Triangle(side_a, side_b, side_c);
            fail("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle");
        } catch (IllegalArgumentException e) {
            assertEquals("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle", e.getMessage());
        }
    }
    @Test
    public void throwIllegalArgumentExceptionWhenSecondSideIsEqualToTheSumOfTheOtherTwoSides() throws Exception {
        int side_a = 1;
        int side_b = 2;
        int side_c = 1;

        try {
            new Triangle(side_a, side_b, side_c);
            fail("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle");
        } catch (IllegalArgumentException e) {
            assertEquals("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle", e.getMessage());
        }
    }
    @Test
    public void throwIllegalArgumentExceptionWhenThirdSideIsEqualToTheSumOfTheOtherTwoSides() throws Exception {
        int side_a = 1;
        int side_b = 1;
        int side_c = 2;

        try {
            new Triangle(side_a, side_b, side_c);
            fail("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle");
        } catch (IllegalArgumentException e) {
            assertEquals("Side lengths [" + side_a + ", " + side_b + ", " + side_c + "] do not form a valid triangle", e.getMessage());
        }
    }
}

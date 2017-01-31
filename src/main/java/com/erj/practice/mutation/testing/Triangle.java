package com.erj.practice.mutation.testing;

public class Triangle {

    private int side_a;
    private int side_b;
    private int side_c;
    
    public Triangle() {
        this(1,1,1);
    }
    
    public Triangle(int side_a, int side_b, int side_c) {
        validateLengths(side_a, side_b, side_c);
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public int getNumberOfSides() {
        return 3;
    }

    public double getPerimeter() {
        return side_a + side_b + side_c;
    }
    
    public double getArea(){
        double halfPerimeter = getPerimeter()/2.0;
        return Math.sqrt(halfPerimeter*(halfPerimeter-side_a)*(halfPerimeter-side_b)*(halfPerimeter-side_c));
    }
    
    private void validateLengths(int side_a, int side_b, int side_c){
        if(side_a + side_b <= side_c || side_b + side_c <= side_a || side_c + side_a <= side_b){
            throw new IllegalArgumentException("Side lengths ["+side_a+", "+side_b+", "+side_c+"] do not form a valid triangle");
        }
    }
}

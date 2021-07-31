package examen1;

import static java.lang.Math.sqrt;

public class Triangle implements Shape{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public double calculateSurface(){
        double semiPerimeter = this.calculatePerimeter()/2;
        return sqrt(semiPerimeter*(semiPerimeter- side1)*(semiPerimeter- side2)*(semiPerimeter- side3));
    }
}

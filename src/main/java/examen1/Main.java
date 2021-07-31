package examen1;

public class Main {
    public static void main(String[] args) {

        DrawingTool shapes=new DrawingTool();
        Circle circle=new Circle(5);
        shapes.addShape(circle);
        Triangle triangle=new Triangle(3, 5, 8);
        shapes.addShape(triangle);
        Rectangle rectangle=new Rectangle(4,7);
        shapes.addShape(rectangle);
        Square square=new Square(7);
        shapes.addShape(square);

        System.out.println("Total sum for perimeter is: "+String.format("%.2f",shapes.calculatePerimeterSum()));
        System.out.println("Total sum for surface is: "+String.format("%.2f", shapes.calculateSurfaceSum()));

        Square square2=new Square(5);
        shapes.addShape(square2);
    }
}

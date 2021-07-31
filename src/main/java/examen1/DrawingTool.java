package examen1;

import java.util.ArrayList;
import java.util.List;

public class DrawingTool {
    private List<Shape> shapes;

    public DrawingTool() {
        this.shapes = new ArrayList<Shape>();
    }


    public void addShape(Shape shape){
        if(!checkShapeInList(shape)){
            shapes.add(shape);
        }
        else{
            System.out.println("Forma deja exista");
        }
    }


    private boolean checkShapeInList(Shape shape){
        boolean b = false;
        for(Shape s : shapes){
            if (s.getClass() == shape.getClass()){
                b = true;
            }
        }
        return b;
    }


    public List<Shape> getShapes() {
        return shapes;
    }

    public double calculatePerimeterSum(){
        double sum = 0;
        for (Shape shape: shapes) {
            sum = sum + shape.calculatePerimeter();
        }
        return sum;
    }

    public double calculateSurfaceSum(){
        double sum = 0;
        for (Shape shape:shapes) {
            sum = sum + shape.calculateSurface();
        }
        return sum;
    }
}

package java8;

interface Shape
{
    void draw();
}

class Rectangle implements Shape
{

    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }
}

class Circle implements Shape
{
    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}

public class Myclass {
    public static void main(String[] args) {
        // need reference to draw labda expression
//        shape s = new Circle();
//        s.draw();
        Shape rectangle  =    () ->System.out.println("Rectangle draw");
     //   rectangle.draw();
        Shape circle =   ()-> System.out.println("Circle Draw");
     //   circle.draw();
        printUsingLambdaFunction(rectangle);
        printUsingLambdaFunction(circle);
    }

    private static void printUsingLambdaFunction(Shape shape) {
        shape.draw();

    }
}

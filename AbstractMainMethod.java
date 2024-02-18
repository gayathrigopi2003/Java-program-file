// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract int area();
}

// Concrete subclass 1
class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    // Implementing the abstract method area() for Circle
    int area() {
        return radius * radius;
    }
}

// Concrete subclass 2
class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method area() for Rectangle
    int area() {
        return length * width;
    }
}

public class AbstractMainMethod {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calling the area() method on objects of different concrete subclasses
        int circleArea = circle.area();
        int rectangleArea = rectangle.area();

        // Displaying the results
        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
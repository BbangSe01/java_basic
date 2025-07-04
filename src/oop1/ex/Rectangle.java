package oop1.ex;

public class Rectangle {
    int width=8;
    int height=8;

    int calculateArea() {
        return width*height;
    }
    int calculatePerimeter() {
        return (2*width)+(2*height);
    }

    boolean isSquare() {
        return width==height;
    }
}

package main.java.inheritance;

// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape {
    boolean isSquare() {
        if(width == height) return true;
        return false;
    }

    double area() {
        return width * height;
    }
}
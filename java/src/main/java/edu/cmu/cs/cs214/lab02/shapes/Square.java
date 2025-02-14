package edu.cmu.cs.cs214.lab02.shapes;

// import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side length " + sideLen);
    }
}
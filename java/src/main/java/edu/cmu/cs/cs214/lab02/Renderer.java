package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    public Shape shape;
    
    Renderer(Shape shapes) {
        this.shape=shapes;
    }

    void draw() {
        double area = shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}

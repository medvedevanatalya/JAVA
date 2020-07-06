package org.step.dz4;

public class Runner {
    public static void main(String[] args) throws MyException {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Периметр прямоугольника равен " + rectangle1.getPerimeter(rectangle1.getWidth(), rectangle1.getHeight()));

        Rectangle rectangle2 = new Rectangle(15, 22);
        System.out.println("Периметр прямоугольника равен " + rectangle2.getPerimeter(rectangle2.getWidth(), rectangle2.getHeight()));

        Rectangle rectangle3 = new Rectangle(0, 6);
        System.out.println("Периметр прямоугольника равен " + rectangle3.getPerimeter(rectangle3.getWidth(), rectangle3.getHeight()));

    }
}

package org.step.dz4;


public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 10;
        this.height = 5;
    }

    public Rectangle(double width, double height) throws MyException {
        if(width<=0 || height<=0){
            throw new MyException("Некорректный ввод длины/ширины");
        }
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws MyException {
        if(width<=0){
            throw new MyException("Некорректный ввод ширины");
        }
        this.width = width;
    }

    public void setHeight(double height) throws MyException {
        if(height<=0){
            throw new MyException("Некорректный ввод длины");
        }
        this.height = height;
    }

    public double getPerimeter(double width, double height){
        Rectangle rectangle = new Rectangle();

        try {
            rectangle.setHeight(height);
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

        try {
            rectangle.setWidth(width);
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

        return (rectangle.getHeight() + rectangle.getWidth()) * 2;
    }
}

package org.step.task1;


public class Runner {

    public static void main(String[] args) {
        Pen firstPen = new Pen(120, "red");
        Pen secondPen = new Pen(120.25);
        Pen thirdPen = new Pen(120, "red");

        System.out.println(firstPen.hashCode());
        System.out.println(secondPen.hashCode());
        System.out.println(thirdPen.hashCode());

        boolean isSameFirst = firstPen.equals(secondPen);
        boolean isSameSecond = secondPen.equals(thirdPen);
        boolean isSameThird = thirdPen.equals(firstPen);
        System.out.println(isSameFirst);
        System.out.println(isSameSecond);
        System.out.println(isSameThird);

        System.out.println(firstPen.toString());
        System.out.println(secondPen.toString());
        System.out.println(thirdPen.toString());
    }
}

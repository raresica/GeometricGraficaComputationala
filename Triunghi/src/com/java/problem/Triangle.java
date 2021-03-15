package com.java.problem;

import java.util.SimpleTimeZone;

public class Triangle{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    //private double lengthAB;
    //private double lengthAC;
    //private double lengthBC;

    private double area;
    private double delta;
    private double perimeter, semiPerimeter;

    public Triangle() {
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }


    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }

    //for a), the next 3 methods
    public void getArea(){
        setArea();
        System.out.println("The area of the triangle is: " + area);
    }
    public double doubleGetArea(){
        return area;
    }

    private void setArea(){
        setDelta();
        area = (delta / 2);
    }

    private void setDelta(){
        delta = ((pointB.getX() * pointC.getY()) +
                (pointC.getX() * pointA.getY()) +
                (pointA.getX() * pointB.getY()) -
                (pointB.getX() * pointA.getY()) -
                (pointC.getX() * pointB.getY()) -
                (pointA.getX() * pointC.getY()));
    }

    private void setPerimeter(){
        Point point = new Point();
        double langeAB = point.setLength(pointA, pointB);
        double langeAC = point.setLength(pointA, pointC);
        double langeBC = point.setLength(pointB, pointC);
        perimeter = ((langeAB + langeAC + langeBC) / 3);
    }

    public double doubleGetSemiPerimeter(){
        setSemiPerimeter();
        return semiPerimeter;
    }

    private void setSemiPerimeter(){
        setPerimeter();
        semiPerimeter = perimeter / 2;
    }
}

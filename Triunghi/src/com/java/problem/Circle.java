package com.java.problem;

public class Circle{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    private Point pointCircle;
    private double radius;

    public Circle(){

    }

    public Circle(Point pointA, Point pointB, Point pointC) {
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
        return "Circle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", pointCircle=" + pointCircle +
                ", radius=" + radius +
                '}';
    }
    public void getCircleCenter(){
        setCircleCenter();
        System.out.println("The center of the circle is: ( " + pointCircle.getX() + ", " + pointCircle.getY() + ")");
    }

    private void setCircleCenter(){
        Point point = new Point();
        double langeAB = point.setLength(pointA, pointB);
        double langeAC = point.setLength(pointA, pointC);
        double langeBC = point.setLength(pointB, pointC);
        point.setX((((langeBC * pointA.getX()) + (langeAC * pointB.getX()) + (langeAB * pointC.getX())) / 3));
        point.setY((((langeBC * pointA.getY()) + (langeAC * pointB.getY()) + (langeAB * pointC.getY())) / 3));
        pointCircle = point;
    }

    public void getCircleRadius(Triangle triangle){
        setCircleRadius(triangle);
        System.out.println("The radius of the circle is: " + radius);
    }

    private void setCircleRadius(Triangle triangle){
        double semiPerimeter = triangle.doubleGetSemiPerimeter();
        double area = triangle.doubleGetArea();
        radius = (area / semiPerimeter);
    }

}

package com.java.problem;

public class Point {
    private double x;
    private double y;

    public Point(){
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double setLength(Point pointA, Point pointB){
        return Math.sqrt(
                (Math.pow((pointB.getX() - pointA.getX()), 2)) +
                Math.pow((pointB.getY() - pointA.getY()), 2));
    }
}

package com.java.problem;

public class LineEquation {
    private Point pointA;
    private Point pointB;
    private double slope;

    public LineEquation() {
    }

    public LineEquation(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
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

    public void setSlope(){
        slope = ((pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX()));
    }

    @Override
    public String toString() {
        double term = (slope * pointA.getX() + pointA.getY());
        if(term > 0) {
            return slope + "x -y +" + term + " = 0";
        }
        else if(term < 0){
            return slope + "x -y " + term + " = 0";
        }   else{
            return slope + "x -y " + " = 0";
            }
    }
}

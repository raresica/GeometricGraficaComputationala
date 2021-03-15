package com.java.application;

import com.java.problem.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Point pointA = new Point(2, 0);
        Point pointB = new Point(0, 3);
        Point pointC = new Point(5, 4);

        Triangle triangle1 = new Triangle(pointA, pointB, pointC);
        //System.out.println(triangle1);
        triangle1.getArea();

        Circle circle1 = new Circle(pointA, pointB, pointC);
        circle1.getCircleCenter();
        circle1.getCircleRadius(triangle1);

        LineEquation lineEquationAB = new LineEquation(pointA, pointB);
        lineEquationAB.setSlope();
        System.out.println("(AB): " + lineEquationAB);
        LineEquation lineEquationAC = new LineEquation(pointA, pointC);
        lineEquationAC.setSlope();
        System.out.println("(AC): " + lineEquationAC);
        LineEquation lineEquationBC = new LineEquation(pointB, pointC);
        lineEquationBC.setSlope();
        System.out.println("(BC): " + lineEquationBC);
    }
}

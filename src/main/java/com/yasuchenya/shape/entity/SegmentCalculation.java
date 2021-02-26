package com.yasuchenya.shape.entity;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SegmentCalculation {

    private SegmentCalculation(){

    }

    public static double calculateSegmentLength(CartesianPoint startingPoint, CartesianPoint endingPoint){
        return sqrt(pow((endingPoint.getX() - startingPoint.getX()), 2)
                + pow((endingPoint.getY() - startingPoint.getY()), 2));
    }
}

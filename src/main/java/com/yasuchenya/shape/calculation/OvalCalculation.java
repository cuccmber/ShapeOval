package com.yasuchenya.shape.calculation;

import com.yasuchenya.shape.entity.Oval;
import com.yasuchenya.shape.entity.SegmentCalculation;
import com.yasuchenya.shape.validator.OvalValidator;

import static java.lang.Math.pow;

public class OvalCalculation {

    public static double calculateArea(Oval oval){
        double majorSemiAxis = SegmentCalculation.calculateSegmentLength(oval.getCenter(), oval.getMajorAxisEndPoint());
        double minorSemiAxis = SegmentCalculation.calculateSegmentLength(oval.getCenter(), oval.getMinorAxisEndPoint());
        return Math.PI * majorSemiAxis * minorSemiAxis;
    }

    public static double calculatePerimeter(Oval oval){
        double majorSemiAxis = SegmentCalculation.calculateSegmentLength(oval.getCenter(), oval.getMajorAxisEndPoint());
        double minorSemiAxis = SegmentCalculation.calculateSegmentLength(oval.getCenter(), oval.getMinorAxisEndPoint());
        return 4 * (Math.PI * majorSemiAxis * minorSemiAxis + pow((majorSemiAxis - minorSemiAxis), 2))
                / (majorSemiAxis + minorSemiAxis);
    }
}

package com.yasuchenya.shape.validator;

import com.yasuchenya.shape.entity.Oval;
import com.yasuchenya.shape.entity.SegmentCalculation;

public class OvalValidator {

    public static boolean isOval(Oval oval){
        double majorSemiAxis = SegmentCalculation.calculateSegmentLength(oval.getCenter(), oval.getMajorAxisEndPoint());
        double minorSemiAxis = SegmentCalculation.calculateSegmentLength(oval.getCenter(), oval.getMinorAxisEndPoint());
        return majorSemiAxis > 0 && minorSemiAxis > 0;
    }
}

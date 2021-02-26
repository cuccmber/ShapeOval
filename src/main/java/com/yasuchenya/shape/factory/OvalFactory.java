package com.yasuchenya.shape.factory;

import com.yasuchenya.shape.entity.AbstractShape;
import com.yasuchenya.shape.entity.CartesianPoint;
import com.yasuchenya.shape.entity.Oval;
import com.yasuchenya.shape.exception.ShapeException;
import com.yasuchenya.shape.validator.OvalValidator;

public class OvalFactory{
    public static AbstractShape createShape(CartesianPoint center, CartesianPoint majorAxisEndPoint, CartesianPoint minorAxisEndPoint) {
        return new Oval(center, majorAxisEndPoint, minorAxisEndPoint);
    }
}

package com.yasuchenya.shape.entity;

public class Oval extends AbstractShape{
    private CartesianPoint center;
    private CartesianPoint majorAxisEndPoint;
    private CartesianPoint minorAxisEndPoint;

    public Oval(CartesianPoint center, CartesianPoint majorAxisEndPoint, CartesianPoint minorAxisEndPoint){
        super();
        this.center = center;
        this.majorAxisEndPoint = majorAxisEndPoint;
        this.minorAxisEndPoint = minorAxisEndPoint;
        double majorSemiAxis = SegmentCalculation.calculateSegmentLength(getCenter(), getMajorAxisEndPoint());
        double minorSemiAxis = SegmentCalculation.calculateSegmentLength(getCenter(), getMinorAxisEndPoint());
        if(majorSemiAxis < minorSemiAxis){
            this.majorAxisEndPoint = minorAxisEndPoint;
            this.minorAxisEndPoint = majorAxisEndPoint;
        }
    }

    public CartesianPoint getCenter() {
        return center;
    }

    public void setCenter(CartesianPoint center) {
        this.center = center;
    }

    public CartesianPoint getMajorAxisEndPoint() {
        return majorAxisEndPoint;
    }

    public void setMajorAxisEndPoint(CartesianPoint majorAxisEndPoint) {
        this.majorAxisEndPoint = majorAxisEndPoint;
    }

    public CartesianPoint getMinorAxisEndPoint() {
        return minorAxisEndPoint;
    }

    public void setMinorAxisEndPoint(CartesianPoint minorAxisEndPoint) {
        this.minorAxisEndPoint = minorAxisEndPoint;
    }

    @Override
    public int hashCode(){
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + center.hashCode();
        result = PRIME * result + majorAxisEndPoint.hashCode();
        result = PRIME * result + minorAxisEndPoint.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        Oval temp = (Oval) o;

        return o instanceof Oval && super.equals(o) && center.equals(temp.center)
                && majorAxisEndPoint.equals(temp.majorAxisEndPoint)
                && minorAxisEndPoint.equals(temp.minorAxisEndPoint);
    }

    @Override
    public String toString(){
        return  super.toString() +
                "Oval:" +
                "center=" + center.toString() + "," +
                "majorAxisEndPoint=" + majorAxisEndPoint.toString() + "," +
                "majorAxisEndPoint=" + minorAxisEndPoint.toString();
    }
}

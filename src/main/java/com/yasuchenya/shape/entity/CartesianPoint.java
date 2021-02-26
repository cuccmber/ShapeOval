package com.yasuchenya.shape.entity;

public class CartesianPoint {
    private int x;
    private int y;

    public CartesianPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode(){
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + x;
        result = PRIME * result + y;
        return result;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        CartesianPoint temp = (CartesianPoint) o;

        return o != null && o.getClass() == getClass() && x == temp.x;
    }

    @Override
    public String toString(){
        return "Point:" +
                "x=" + x + "," +
                "y=" + y;
    }
}

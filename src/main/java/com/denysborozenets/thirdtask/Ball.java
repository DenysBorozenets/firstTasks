package com.denysborozenets.thirdtask;

public class Ball implements Shape {

    private static final double PI = 3.14;
    private int radius;

    public Ball(int radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4 * PI * Math.pow(getRadius(), 3)) / 3;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                '}';
    }
}

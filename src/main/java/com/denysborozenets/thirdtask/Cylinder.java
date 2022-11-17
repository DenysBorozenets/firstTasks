package com.denysborozenets.thirdtask;

public class Cylinder implements Shape {
    private static final double PI = 3.14;
    private int height;
    private int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double volume() {
        return PI * Math.pow(getRadius(), 2) * getHeight();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}

package com.denysborozenets.thirdtask;

public class Cube implements Shape {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(getSide(), 3);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
}

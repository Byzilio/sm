package com.selfmade.helper;

public class Pair<T> {

    private T x;
    private T y;

    public Pair(final T x, final T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(final T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(final T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

package com.playwithjava;

public class Main {

    public static void main(String[] args) {
        var point1 = new Point(10, 10);
        var point2 = new Point(10, 10);
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(new TextBox()));

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }
}

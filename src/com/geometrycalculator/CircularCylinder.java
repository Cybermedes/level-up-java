package com.geometrycalculator;

import java.util.Locale;

class CircularCylinder extends Variables {

    void calcSurfaceArea(double radius, double height) {
        area = 2 * Math.PI * radius * (height + radius);
        System.out.printf(Locale.US, "The surface area is %.2f u.a.\n", area);
    }

    void calcVolume(double radius, double height) {
        volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf(Locale.US, "The volume is %.2f u.v.\n", volume);
    }
}

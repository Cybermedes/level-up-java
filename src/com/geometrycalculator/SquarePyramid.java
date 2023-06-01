package com.geometrycalculator;

import java.util.Locale;

class SquarePyramid extends Variables {

    void calcSurfaceArea(double side, double height) {
        area = side * (side + Math.sqrt(Math.pow(side, 2) + 4 * Math.pow(height, 2)));
        System.out.printf(Locale.US, "The surface area is %.2f u.a.\n", area);
    }

    void calcVolume(double side, double height) {
        volume = (Math.pow(side, 2) * height) / 3;
        System.out.printf(Locale.US, "The volume is %.2f u.v.\n", volume);
    }
}

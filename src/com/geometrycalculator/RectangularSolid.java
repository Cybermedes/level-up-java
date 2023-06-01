package com.geometrycalculator;

import java.util.Locale;

class RectangularSolid extends Variables {

    void calcSurfaceArea(double length, double width, double height) {
        area = 2 * length * width + 2 * length * height + 2 * width * height;
        System.out.printf(Locale.US, "The surface area is %.2f u.a.\n", area);
    }

    void calcVolume(double length, double width, double height) {
        volume = length * width * height;
        System.out.printf(Locale.US, "The volume is %.2f u.v.\n", volume);
    }
}

package geometrycalculator;

import java.util.Locale;

class Cube extends Variables {

    void calcSurfaceArea(double side) {
        area = 6 * Math.pow(side, 2);
        System.out.printf(Locale.US, "The surface area is %.2f u.a.\n", area);
    }

    void calcVolume(double side) {
        volume = Math.pow(side, 3);
        System.out.printf(Locale.US, "The volume is %.2f u.v.\n", volume);
    }
}

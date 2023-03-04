package geometrycalculator;

import java.util.Locale;

class Sphere extends Variables {

    void calcSurfaceArea(double radius) {
        area = 4 * Math.PI * Math.pow(radius, 2);
        System.out.printf(Locale.US, "The surface area is %.2f u.a.\n", area);
    }

    void calcVolume(double radius) {
        volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
        System.out.printf(Locale.US, "The volume is %.2f u.v.\n", volume);
    }
}

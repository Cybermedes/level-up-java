package geometrycalculator;

import java.util.Locale;

class CircularCone extends Variables {

    void calcSurfaceArea(double radius, double height) {
        area = Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
        System.out.printf(Locale.US, "The surface area is %.2f u.a.\n", area);
    }

    void calcVolume(double radius, double height) {
        volume = (Math.PI * Math.pow(radius, 2) * height) / 3;
        System.out.printf(Locale.US, "The volume is %.2f u.v.\n", volume);
    }
}

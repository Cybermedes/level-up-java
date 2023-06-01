package com.geometrycalculator;

import java.util.Locale;
import java.util.Scanner;


class Variables {
    Scanner reader = new Scanner(System.in);

    double side, width, height, radius, volume, area;

    double getSideValue() {
        System.out.println("The value of the side:");
        side = reader.useLocale(Locale.US).nextDouble();
        return side;
    }

    double getWidthValue() {
        System.out.println("The value of the width:");
        width = reader.useLocale(Locale.US).nextDouble();
        return width;
    }

    double getHeightValue() {
        System.out.println("The value of the height:");
        height = reader.useLocale(Locale.US).nextDouble();
        return height;
    }

    double getRadiusValue() {
        System.out.println("The value of the radius:");
        radius = reader.useLocale(Locale.US).nextDouble();
        return radius;
    }
}

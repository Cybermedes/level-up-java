package geometrycalculator;

import java.util.Scanner;

class GeometryMainPage {

    //Program that calculates the Surface Area and Volume of some 3D geometric shapes
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Sphere sphere = new Sphere();
        Cube cube = new Cube();
        RectangularSolid rectangle = new RectangularSolid();
        CircularCylinder cylinder = new CircularCylinder();
        SquarePyramid pyramid = new SquarePyramid();
        CircularCone cone = new CircularCone();

        System.out.println("Pick up one geometric form:\n" +
                "(1) cube, (2) rectangle, (3) sphere, (4) square pyramid, \n" +
                "(5) cylinder, (6) cone");
        int userChoice = reader.nextInt();
        double tempSide, tempHeight, tempWidth, tempRadius;
        switch (userChoice) {
            case 1:
                tempSide = cube.getSideValue();
                cube.calcSurfaceArea(tempSide);
                cube.calcVolume(tempSide);
                break;
            case 2:
                tempSide = rectangle.getSideValue();
                tempWidth = rectangle.getWidthValue();
                tempHeight = rectangle.getHeightValue();
                rectangle.calcSurfaceArea(tempSide, tempWidth, tempHeight);
                rectangle.calcVolume(tempSide, tempWidth, tempHeight);
                break;
            case 3:
                tempRadius = sphere.getRadiusValue();
                sphere.calcSurfaceArea(tempRadius);
                sphere.calcVolume(tempRadius);
                break;
            case 4:
                tempSide = pyramid.getSideValue();
                tempHeight = pyramid.getHeightValue();
                pyramid.calcSurfaceArea(tempSide, tempHeight);
                pyramid.calcVolume(tempSide, tempHeight);
                break;
            case 5:
                tempRadius = cylinder.getRadiusValue();
                tempHeight = cylinder.getHeightValue();
                cylinder.calcSurfaceArea(tempRadius, tempHeight);
                cylinder.calcVolume(tempRadius, tempHeight);
                break;
            case 6:
                tempRadius = cone.getRadiusValue();
                tempHeight = cone.getHeightValue();
                cone.calcSurfaceArea(tempRadius, tempHeight);
                cone.calcVolume(tempRadius, tempHeight);
                break;
            default:
                System.out.println("You need to type a number!");
        }
    }
}
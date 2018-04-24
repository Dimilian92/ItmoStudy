package Geometry;

public class Triangel extends GeometryFigur {
    double side1;
    double side2;
    double side3;
    @Override
    public void peremetr(double side1, double side2, double side3) {
        double peremetrTriangel = side1+side2+side3;
    }

    @Override
    public void squaer(double side1, double side2, double side3) {
        double p = (side1+side2+side3)/2;
        double squaerTriangel = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));

    }


}

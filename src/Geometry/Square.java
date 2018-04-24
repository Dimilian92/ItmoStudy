package Geometry;

public class Square extends GeometryFigur {
    double side1;
    double side2;
    double side3;
    double side4;


    @Override
    public void peremetr(double side1, double side2, double side3) {
        double perem = 4*(side1);
    }

    @Override
    public void squaer(double side1, double side2, double side3) {
        double sq = side1*side1;
    }
}

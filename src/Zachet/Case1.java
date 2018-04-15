package Zachet;

public class Case1 {
    public   enum Planets{
        MERCURY (3.303e+23, 2.4397e6, 55.6),
        VENUS   (4.869e+24, 6.0518e6, 559.5),
        EARTH   (5.976e+24, 6.37814e6, 549.8),
        MARS    (6.421e+23, 3.3972e6, 4694.89),
        JUPITER (1.9e+27,   7.1492e7, 558.68),
        SATURN  (5.688e+26, 6.0268e7, 84859.555),
        URANUS  (8.686e+25, 2.5559e7, 898.554),
        NEPTUNE (1.024e+26, 2.4746e7, 554.554);

        private  double mass;
        private  double radius;
        private  double orbit;
        private   Planets(double mass, double radius, double orbit){
            this.mass = mass;
            this.radius = radius;
            this.orbit = orbit;
        }
        public double getMass() {
            return mass;
        }
        public double getRadius(){
            return radius;
        }

        public double getOrbit(){
            return orbit;
        }


    }

    public static void main(String[] args) {
        for(Planets p : Planets.values()){
            System.out.println("Масса планеты "+p+" составляет " +p.mass+" радиус "+p.radius+" радиус орбиты "+p.orbit);
        }


    }
}

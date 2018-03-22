import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class HW1 {
    public static void main(String[] args) {
        ///// Первая задача
        double m = 8;
        double n = 6;
        if ((10 - abs(m))>(10 - abs(n))) {
            System.out.println("Ближайшее число: " + n);}
            else  if ((10 - abs(m))<(10 - abs(n))){
            System.out.println("Ближайшее число: " + m);}
            else {
            System.out.println("Числа равны");}
            System.out.println("");

        //// Вторая задача
        double a = 3.4;
        double b = 12;
        double c = 64;
        double Rootofdouble;
        Rootofdouble = b * b - 4 * a * c;
        if (Rootofdouble > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(Rootofdouble)) / (2 * a);
            x2 = (-b + Math.sqrt(Rootofdouble)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (Rootofdouble == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
        System.out.println("");

        //// Третья задача
        int q = 643;
        int q1 = q/100;
        int q2 = q/10 - (q1*10);
        int q3 = q % 10;
        if ((q1+q2)>(q2+q3)){
            if (q1>q2) System.out.println(q1);
            else System.out.println(q2);
        }
        else {if (q2>q3) System.out.println(q2);
        else System.out.println(q3);}
        System.out.println("");

        ///Четвертая задача

        int num1 = 3;
        int num2 = -4;
        int num3 = 43;
        int mid;



        //// Цикл 1

        int cir = 1000;
        while (cir <= 9999){
            System.out.println(cir);
            cir+=3;
        }
        System.out.println("");

        /// Цикл 2
        for(int cir2 = 90; cir2>=0; cir2-=5){
            System.out.println(cir2);
        }
        System.out.println("");

        /// Цикл 3
        int cir3 = 2;
        for (int i = 0; i <20; i++){
            System.out.println(cir3);
            cir3 = cir3*2;
        }
        System.out.println("");

        /// Цикл 4






        }
    }


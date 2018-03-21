import static java.lang.Math.abs;

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
        //// Вторая задача


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

        ///



        }
    }


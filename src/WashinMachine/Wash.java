package WashinMachine;

import java.util.Scanner;

public class Wash {
    public static void main(String[] args) {
        int plate;
        double washingGel;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество грязных тарелок: ");
        plate = scanner.nextInt();
        System.out.println("Введите колличество моющего средства в литрах: ");
        washingGel = scanner.nextDouble();
        double cleanDishes = washingGel/0.5;
        if(cleanDishes > plate){
            System.out.println("Все тарелки чисты, осталось "+(cleanDishes-plate)+" мл средства");
        }
        else if(cleanDishes < plate){
            System.out.println("Все средство закончилось, осталось "+(plate-cleanDishes)+" грязных тарелок");
        }
        else {
            System.out.println("Всё ровно!");
        }
    }
}

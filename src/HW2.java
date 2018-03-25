import java.util.*;

public class HW2 {
    public static void main(String[] args) {
//        /// Задача 1
//        int[] arr1 = new int[10];
//        int i2 = 1;
//        for (int i = 0; i < 10; i++) {
//            arr1[i] = i2 * 2;
//            i2 = i2 + 1;
//            System.out.println(arr1[i]);
//
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(arr1[i]);
//        }

        // Вторая задача

        int[] d = new int[50];

        for (int x = 0; x < 50; x++) {
            d[x] = x * 2 + 1;
            System.out.println(d[x] + " ");
        }

        // Третья задача
        int count1 = 0;
        int[] s = new int[15];
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < 15; i++) {
            s[i] = rnd.nextInt(9);
            if (s[i] % 2 == 0 && s[i]!=0) {
                count1++;
            }

        }
        System.out.println("Чётных чисел в массиве " + count1);
        System.out.println(Arrays.toString(s));

        /// Четвертая задача
        int sum1 =0;
        int sum2 = 0;
        int [] x1 = new int [5];
        int [] x2 = new int [5];
        Random rnd1 = new Random(System.currentTimeMillis());
        for (int i = 0; i < 5; i++){
            x1[i] = rnd1.nextInt(5);
            x2[i] = rnd1.nextInt(5);
            sum1 = sum1 + x1[i];
            sum2 = sum2 + x2[i];
        }
        double aver1 = sum1/ x1.length;
        double aver2 = sum2/ x2.length;
        if (aver1 > aver2){
            System.out.println("Средне арифметическое массива Х1 больше");
        }
        else if (aver1 < aver2){
            System.out.println("Средне арифметическое массива Х2 больше");
        }
        else {
            System.out.println("Средне арифметическое массивов равны");
        }

        /// Пятая задача
        int counter = 0;
        int prev = 0;
        int [] x3 = new int[5];
        int ran1 = 10;
        int ran2 = 99;
        for (int i = 0; i<5; i++){
            x3[i]=ran1+(int)(Math.random()*ran2);
        }
        for (int i = 0; i<5; i++){
            if (x3[i]>prev){
                counter = counter + 1;
                prev = x3[i];
            }
            else {
                System.out.println("Массив не упорядочен по возрастанию");
                break;
            }
            if (counter == 5){
                System.out.println("Массив упорядочен по возрастанию");
           }
        }

        //// Задача шестая

        //// Строки, задача 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String mainString = sc.nextLine();
        System.out.println("Введите строку которую мы хотим найти для замены");
        String find = sc.nextLine();
        System.out.println("Введите строку которой мы заменем выбранную выше строку");
        String replace = sc.nextLine();
        String result = mainString.replace(find, replace);
        System.out.println("После замены результат: "+result);

        //// Строки, задача 2

        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : result.toCharArray())
        {
            if (!set.contains(c))
            {
                set.add(c);
                sb.append(c);
            }
        }
        String result2 = sb.toString();
        System.out.println("После удаления дублей результат: "+result2);

        /// Строки, задача 3


    }
    }


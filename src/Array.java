import java.util.Arrays;

public class Array {
    public static void main(String[] args) {


        int arr[];
        String[] arr2;
        String arr0 [] = new String [6];
        int arr3[] = new int[4];
        /// Указали сколько элементов в массиве, в данном случае 4
        String arr4[] = new String[3];
        System.out.println(Arrays.toString(arr3));

        int [] arr5 = {4, 5, 6, 15};

        int a = 6;
        int [] arr6 = {a, 4, 7};
        /// Можно назначить и так

        int arr6Elem = arr6[0];
        System.out.println(arr6Elem);

        for (int i = 0; i < arr0.length; i++){
            arr0[i]= "elem #"+i;
        }
        System.out.println(Arrays.toString(arr3));

        for (int i = 0; arr5.length > i; i++){
            System.out.println("# "+i+" значение "+arr5[i]);
        }
        /// Перебрали массив по элементам

        for(int arr_val : arr5){
            System.out.println("val "+arr_val);
        }
        /// Расширенный FOR

        int [] newArr3 = arr3.clone();
        /// Копирование массива (вариант 1)
        int arr66 [] = {45, 4545,32,565,122,3434,64,46,1,32,4};
      //  System.arraycopy(
                // Массив источник ,
                // позиция (начало нового массива) с какого элемента начинается копирование
                // Массив назначения; куда складываем
                // начальная позиция целевого массива; сколько элементов возьмёт
                // колличество копируемых элементов
     //   );

        //int [] newArrA = System.arraycopy(arr66, 2 , newArrA, 0, 2);
        /// Копирование массива (вариант 2)

        //int [] newArray7 = Arrays.copyOf( исхоный массив, длинна нового массива);
        //Arrays.copyOfRange(исходный массив, индекс начала , индекс окончания);
        int [] newArrayD = Arrays.copyOfRange(arr66, 0, 4);
        System.out.println(Arrays.toString(newArrayD));
        /// Копирование массива 3


//        boolean equals = Arrays.equals(arr66, arr4);
//        System.out.println(equals);







        /// Многомерные массивы

        int [][] arr2d = new int [10][];
        for (int i =0; i < arr2d.length; i++){
            arr2d [i] = new int[i];
            System.out.println(Arrays.toString(arr2d[i]));
            System.out.println(Arrays.deepToString(arr2d));
        }

    }
}

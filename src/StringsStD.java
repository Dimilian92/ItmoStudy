public class StringsStD {
    public static void main(String[] args) {
        String str = "String"; // общепринятый
        String str2 = new String ("String");

        /// Форматирование вывода чисел

        String st = String.format("Шаблон со специальными сомволами %d%n", 456);
        System.out.println(st);

        StringBuilder sb = new StringBuilder();
        sb.append("some new").append("будет добавлять новый текс к предыдущему содержанию").append("но по сути он склеивает, НО изменяет!");
        sb.insert(3, "may");/// принимает int отступ и что вставлять; вставляет на заданную позицию в строчке!!! не стирает

        StringBuilder stFromLoop = new StringBuilder();
        for (int i = 0; i<10; i++){
            stFromLoop.append("number: ").append(i);
        System.out.println(stFromLoop);
        }

        StringBuffer sf = new StringBuffer();




    }
}

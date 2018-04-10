import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class WarPeace {
    public static void main(String[] args) throws IOException {
        File wp = new File("src\\wp.txt");
        List<String> afterWP = Files.readAllLines(wp.toPath());
        List<String[]> list1 = new ArrayList<>();
        List<String> arrLst = new ArrayList<>();
        for (String line : afterWP) {
            String[] wordSplit =
                    line.replaceAll("[-.?)(,:;'\"*]", " ")
                            .toLowerCase()
                            .split("\\s");

            for (String s : wordSplit) {
                if (s.length() > 0)
                    arrLst.add(s.trim());
            }
        }

        for (String word : arrLst) {
            System.out.println(word);
        }


        ////////// сколько раз встречается слово

        int bigestNumb = 0;
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : arrLst)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {

            System.out.println(word + " " + wordToCount.get(word));
            if(bigestNumb < wordToCount.get(word)){
                bigestNumb = wordToCount.get(word);
            }
        }

        System.out.println(bigestNumb);
        System.out.println(wordToCount.containsValue(bigestNumb));
    }
}

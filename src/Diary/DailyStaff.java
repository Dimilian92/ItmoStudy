package Diary;
import Diary.MainDiary;

import java.util.ArrayList;

public class DailyStaff {

    public void addDailyStaff(String toDo){
        System.out.println("You added "+toDo+" to daily staff!");
        ArrayList <String> listToDo = new ArrayList<>();
        listToDo.add(0,toDo);

    }

}

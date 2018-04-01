package Diary;

public class MainDiary  {
    public String dayOfWeek;
    public String month;
    public int day;
    private DailyStaff dailyStaff;
    private MoneySaver moneySaver;
    private Health health;

    public MainDiary(String dayOfWeek, String month, int day){
        this.dayOfWeek = dayOfWeek;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        MainDiary dayBind = new MainDiary("Monday","May", 18);
        dayBind.dailyStaff.addDailyStaff("Buy some milk!");
        dayBind.dailyStaff.addDailyStaff("Do some yoga");
        dayBind.moneySaver.saveGodDameMoney();
        dayBind.health.checkHealth("Good");
        dayBind.health.howDoYou();


    }




}

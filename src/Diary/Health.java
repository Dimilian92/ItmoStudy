package Diary;

public class Health {
    public String healthNow;
    protected void checkHealth(String health){
        healthNow = health;

    }

    protected void howDoYou(){
        System.out.println(healthNow);
    }
}

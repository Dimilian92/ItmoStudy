package animals.domesticanimals;
import animals.animals;

public class domesticanimals extends animals {

    public domesticanimals(String name){
        super(name);
    }
    public void LiveWithPeople(){
        System.out.println("S volkami zhit...");
    }

//    public static void main(String[] args) {
//        domesticanimals da = new domesticanimals("Fedor");
//        System.out.println(da.name);
//        da.say();
//    }
}

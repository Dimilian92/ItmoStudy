package animals.domesticanimals;

public class Cat extends domesticanimals {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void say(){
        System.out.println("Meow!");
    }

    public void say(String text){
        System.out.println("Cat say: "+text);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Pufy");
        cat.say();

        Dog animals2 = new Dog("Sharik");
        animals2.say();
    }
}

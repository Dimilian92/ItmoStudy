package animals.domesticanimals;

import animals.animals;

public class Dog extends domesticanimals {
    public Dog(String name) {
        super(name);
    }
    @Override
    public  void say(){
        super.say();
        System.out.println("Gav-gav!");
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Fido");
        dog.say();
        dog.LiveWithPeople();
    }
}

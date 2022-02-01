package Animals;

public class Dog extends Pet{

    public Dog(String color){
        super(color);
    }

    public void dogStuff(){
        System.out.println("WOW DOGS STUFF");
    }

    @Override
    public void makeSound(){
        System.out.println("WOF WOF");
    }

    @Override
    public void play(){
        System.out.println("licks his toes!");
    }

}

package Animals;

public class Cat  extends Pet{

    public Cat(String color){
        super(color);
    }

    public void catStuff(){
        System.out.println("WOW CAT STUFF!");
    }

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

    @Override
    public void play(){
        System.out.println("squeeck");
    }

}

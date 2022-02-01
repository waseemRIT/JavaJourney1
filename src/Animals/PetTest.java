package Animals;

import static org.junit.jupiter.api.Assertions.*;

public class PetTest {

    public static void showPolyMorphisim(Pet pet){
            pet.makeSound();
            pet.play();
    }


    public static void main(String[] args){

        Cat c1 = new Cat("Black");
        Cat c2 = new Cat("Brown");

        Dog d1= new Dog("Yellow");
        Dog d2 = new Dog("Red");
        Pet dog1 = new Dog("white");

        dog1.play();

        c1.setOwner("Mike");
        System.out.println(c1);

        c2.catStuff();
        System.out.println(d1.getOwner());
        System.out.println(d2.getAge());
        d1.setAge(19);
        System.out.println(d1.getAge());
        d1.dogStuff();

        c1.setAge(5);
        System.out.println(c1.getAge());
//        c1.catStuff();
        System.out.println("#######################");
        showPolyMorphisim(c1);

        showPolyMorphisim(dog1);
    }

}
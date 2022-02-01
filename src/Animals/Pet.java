package Animals;

public abstract class Pet {
    private int age;
    private String Owner;
    private final String color;

    protected Pet(String color) {
        this.color = color;
    }

    public abstract void makeSound();
    public abstract void play();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    @Override
    public String toString(){
        return "[" + "Owned by " + this.getOwner() + "]";
    }
}

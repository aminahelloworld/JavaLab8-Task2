package animals;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog() {
        super();
        this.breed = "Mixed";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "Unknown");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the dog eats meat and dog food.");
    }

    @Override
    public String getVoice() {
        return "Woof! Woof!";
    }

    public void fetch() {
        System.out.println(getName() + " runs and brings the ball back.");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        String base = super.toString();
        return base.substring(0, base.length() - 1) + ", breed='" + breed + "'}";
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the dog sleeps curled up in its kennel.");
    }

    @Override
    public void move() {
        System.out.println("Dog run");
    }
}
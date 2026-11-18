package animals;

public interface AnimalMove {
    default void move() {
        System.out.println(getClass().getSimpleName() + ": this animal moves in some way");
    }
}
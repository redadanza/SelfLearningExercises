package JavaExer;

public class Tiger extends Felidae{

    public Tiger(int age, double weight, String eating, String running) {
        super(age, weight, eating, running);
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger(5,4.4, "carnivor", "fast");
        tiger.animalSound();
    }
}

package JavaExer;

public class Animal {
    public int age;
    public double weight;
    public String eating;
    public String running;

    public Animal(int age, double weight, String eating, String running) {
        this.age = age;
        this.weight = weight;
        this.eating = eating;
        this.running = running;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEating() {
        return eating;
    }

    public void setEating(String eating) {
        this.eating = eating;
    }

    public String getRunning() {
        return running;
    }

    public void setRunning(String running) {
        this.running = running;
    }
}

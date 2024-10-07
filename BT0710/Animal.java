public class Animal {
    private boolean canSwim;
    private boolean canWalk;

    public Animal(boolean canSwim, boolean canWalk) {
        this.canSwim = canSwim;
        this.canWalk = canWalk;
    }

    public void display() {
        System.out.println("Animal can Swim: " + canSwim);
        System.out.println("Animal can Walk: " + canWalk);
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Duck duck = (Duck) Animal[0];
        Fish fish = (Fish) Animal[1];
        Pig pig = (Pig) Animal[2];
    }

}

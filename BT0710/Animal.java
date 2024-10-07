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
        Animal duck = new Duck();
        Animal fish = new Fish();
        Animal pig = new Pig();
        duck.display();
        fish.display();
        pig.display();
    }

}

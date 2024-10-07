class Pig extends Animal {
    public Pig() {
        super (false, true);
    }

    @Override
    public void display() {
        System.out.println("Pig: ");
        super.display();
    }
}

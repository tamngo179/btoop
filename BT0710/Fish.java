class Fish extends Animal {
    public Fish() {
        super (true, false);
    }

    @Override
    public void display() {
        System.out.println("Fish: ");
        super.display();
    }
}

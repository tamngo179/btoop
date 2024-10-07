class Duck extends Animal {
    @Override
    public boolean canWalk() {
        return true;
    }
    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public String getName() {
        return "Duck";
    }
}

class Fish extends Animal {
    @Override
    public boolean canWalk() {
        return false;
    }
    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public String getName() {
        return "Fish";
    }
}

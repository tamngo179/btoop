class Pig extends Animal {
    @Override
    public boolean canWalk() {
        return true;
    }
    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public String getName() {
        return "Pig";
    }
}

class Student extends Person{
    private String Id;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Student (int birth, String name, String id) {
        super (birth, name);
        this.Id = id;
    }
}

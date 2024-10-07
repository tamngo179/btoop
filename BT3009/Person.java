public class Person {
    public int birth;
    public String name;

    public Person(int birth, String name) {
        this.birth = birth;
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

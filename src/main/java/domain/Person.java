package domain;

public class Person {

    private int age;
    private boolean adult;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getName() {
        return name;
    }

    public boolean isAdult() {
        return adult;
    }
}

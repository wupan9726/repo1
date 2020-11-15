package Object类的tostring方法;

import java.util.Objects;

public class Person {
    private String name;
    private int num;




    public Person() {
    }

    public Person(String name, int num) {
        this.name = name;
        this.num = num;
        Person person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return num == person.num &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }

}

package order.t2;

import java.util.Objects;

/*
* 自定义类实现Comparable<T>,
* */
public class Persion implements Comparable<Persion>{
    public Persion(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int age;

    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persion persion = (Persion) o;
        return age == persion.age &&
                Objects.equals(name, persion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public int compareTo(Persion o) {
        int i = this.name.compareTo(o.name);
        return i;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

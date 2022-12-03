import java.util.Objects;
public class Cat {
    public int id;
    public String name, color;
    public int age;

    public Cat(String name, String color, int age, int id) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.id=id;

        System.out.println("Кличка кота: " + this.name);
        System.out.println("Цвет кота: " + this.color);
        System.out.println("Возраст кота: " + this.age);
        System.out.println("ID кота: " + this.id);
    }


    public boolean equals(Cat otherCat) {
        return this.name.equals(otherCat.name) &&
                this.color.equals(otherCat.color) &&
                this.age == otherCat.age;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}



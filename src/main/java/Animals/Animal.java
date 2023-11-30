package Animals;

public abstract class Animal {

    protected String name;
    protected int age;

    public static int allAnimals = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        allAnimals++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

}

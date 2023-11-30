package Animals;

public class Dog extends Animal{

    public static final int MAX_RUN_DISTANCE = 300;
    public static final int MAX_SWIM_DISTANCE = 5;
    public static int allDogs = 0;
    public Dog(String name, int age) {
        super(name, age);
        allDogs++;
    }



    @Override
    public void run(int distance) {
        if(distance <= MAX_RUN_DISTANCE) {
            System.out.println(getName() + " пробежал " + distance + " метров!");
        } else {
            System.out.println(getName() + " не сможет пробежать столько метров!");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance <= MAX_SWIM_DISTANCE) {
            System.out.println(getName() + " проплыла " + distance + " метров!");
        } else {
            System.out.println(getName() + " не сможет проплыть столько метров!");
        }

    }

}

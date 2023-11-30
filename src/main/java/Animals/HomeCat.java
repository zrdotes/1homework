package Animals;

public class HomeCat extends Animal{

    public static final int MAX_RUN_DISTANCE = 200;
    public static final int MAX_SWIM_DISTANCE = 4;
    public static int allHomeCats = 0;
    public HomeCat(String name, int age) {
        super(name, age);
        allHomeCats++;
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
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(getName() + " проплыл " + distance + " метров!");
        } else {
            System.out.println(getName() + " не проплыть столько метров!");
        }

    }

}

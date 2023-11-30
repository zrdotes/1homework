package Animals;

public class Tiger extends Animal{

    public static final int MAX_RUN_DISTANCE = 600;
    public static final int MAX_SWIM_DISTANCE = 5;
    public static int allTigers = 0;

    public Tiger(String name, int age) {
        super(name, age);
        allTigers++;
    }



    @Override
    public void run(int distance){
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
            System.out.println(getName() + " не сможет проплыть столько метров!");
        }

    }

}

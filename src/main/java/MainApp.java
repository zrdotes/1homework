import Animals.Animal;
import Animals.Dog;
import Animals.HomeCat;
import Animals.Tiger;

public class MainApp {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Барсик", 2),
                new HomeCat("Мурка", 3),
                new Tiger("Tigran", 10)
        };

        int runDistance = 200;
        int swimDistance = 3;

        for (Animal animal : animals) {
            System.out.println("-------");
            animal.run(runDistance);
            animal.swim(swimDistance);
        }

        System.out.println("-------");
        System.out.println("Total Animals: " + Animal.allAnimals);
        System.out.println("Total Tigers: " + Tiger.allTigers);
        System.out.println("Total Cats: " + HomeCat.allHomeCats);
        System.out.println("Total Dogs: " + Dog.allDogs);

//        Dog dog = new Dog("Барсик", 2);
//        dog.run(300);
//        dog.swim(3);
//
//        HomeCat cat = new HomeCat("Мурка", 3);
//        cat.run(199);
//        cat.swim(3);
//
//        Tiger tiger = new Tiger("Tigran", 10);
//        tiger.run(599);
//        tiger.swim(4);

    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("roi"));
        animals.add(new Dog("hoi"));
        animals.add(new Cat("rai"));
        animals.add(new Cat("hai"));

        animals.forEach(Animal::makeSound);
    }
}
package s5_interfaces.example4;

public class Dog implements Mammal{
    @Override
    public void giveBirth() {
        System.out.println("Bark");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog gives birth");
    }
}

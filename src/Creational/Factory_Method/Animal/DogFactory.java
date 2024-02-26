package Creational.Factory_Method.Animal;

public class DogFactory extends IAnimalFactory{

    @Override
    public IAnimal CreateAnimal() {
        return new Dog();
    }
}

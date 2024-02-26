package Creational.Factory_Method.Animal;

public class Dog implements IAnimal {

    @Override
    public void Speak() {
        System.out.println("gau gau.");
    }

    @Override
    public void Action() {
        System.out.println("Dogs prefer barking.");
    }
}

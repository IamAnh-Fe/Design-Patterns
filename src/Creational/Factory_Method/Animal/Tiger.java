package Creational.Factory_Method.Animal;

public class Tiger implements IAnimal {

    @Override
    public void Speak() {
        System.out.println("gru gru");

    }

    @Override
    public void Action() {
        System.out.println("Tigers prefer hunting");

    }
}

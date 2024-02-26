package Creational.Factory_Method.Animal;

public class TigerFactory extends IAnimalFactory{
    @Override
    public IAnimal CreateAnimal() {
        return  new Tiger();
    }
}

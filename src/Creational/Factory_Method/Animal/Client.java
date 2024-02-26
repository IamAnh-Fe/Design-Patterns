package Creational.Factory_Method.Animal;

public class Client {
    public static void main(String[] args) {
        System.out.println("Factory Method demo");
      IAnimalFactory tigerFactory = new TigerFactory();
      IAnimal tiger = tigerFactory.CreateAnimal();
      tiger.Speak();
      tiger.Action();

      IAnimalFactory dogFactory = new DogFactory();
      IAnimal dog = dogFactory.CreateAnimal();
      dog.Speak();
      dog.Action();



    }

}

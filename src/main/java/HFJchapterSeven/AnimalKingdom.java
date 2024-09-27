package HFJchapterSeven;

public class AnimalKingdom {
// static methods and variables belong to the class not the objects
    //className.propertyName or className.methodName();
    public static void main(String[] args) {
        //animal is a data type hence the name of the class
        /* Animal animal1 = new Animal("Humans");
        animal1.name = "lion";
        System.out.println(animal1);
        System.out.println(animal1.name); */

        Lion lion = new Lion("Humans",true);
       // lion.eat();
        lion.name = "Max";
       // System.out.println(lion.getId());

        Hippo hippo = new Hippo("Plants", true);
        //hippo.eat();
        hippo.name = "Teresa";
       // System.out.println(hippo.getId());

        Dog dog = new Dog("Steaks");
        dog.name = "doggie";
       // System.out.println(dog.getId());
        Animal[] zoo = {lion,hippo,dog};

        System.out.println(Animal.getAnimalCount());
Utility.printAnimalNames(zoo);
    }
}

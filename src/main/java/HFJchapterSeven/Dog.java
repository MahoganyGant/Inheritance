package HFJchapterSeven;

public class Dog extends Canine{
    public Dog(String food) {
        super(food); // this is formated like this because it's inherited

    }
    @Override
    public void eat(){
        System.out.println(this.getFood()); //using the getter
    }

}

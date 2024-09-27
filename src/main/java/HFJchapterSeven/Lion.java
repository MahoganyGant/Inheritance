package HFJchapterSeven;
//IS-A relationship - Inheritance
public class Lion extends Feline {

    public boolean roamsInPride;

    public Lion(String food,boolean roamsInPride) {
        super(food); // this is formated like this because it's inherited
        this.roamsInPride = roamsInPride; // this does the same thing as above
    }
    @Override
    public void eat(){
        System.out.println(this.getFood()); //using the getter
    }

}

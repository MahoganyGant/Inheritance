package HFJchapterSeven;

public class Hippo extends Animal{
public boolean canBreatheUndrWater;


    public Hippo(String food,boolean canBreatheUndrWater) {
        super(food);
        this.canBreatheUndrWater = canBreatheUndrWater;
    }
    @Override
    public void eat(){
        System.out.println(this.getFood());
    }
}

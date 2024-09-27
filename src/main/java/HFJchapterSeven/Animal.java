package HFJchapterSeven;
//a class is a blueprint or template for creating objects
//access modifiers: private, public, protected, default
public abstract class Animal {
//introducing and ID property
    private int id;
    private static int animalCount;

    protected String name;
    private String food;

    //next come up with a way to create animals, use a constructor
    public Animal(String food){
       animalCount++;
       id = animalCount;
        this.food = food;
    }

    public String getFood(){
        return this.food;
    }
    public void setFood(String someFood){
        this.food = someFood;
    }
   // public abstract void eat(); //abstract method, method signature

   public abstract void eat();

    //public void eat(){
     //   System.out.println(this.food);
    //}
    //every class in java inherits from the class object in java, read oracle documentation
    @Override
    public String toString(){
        return "Animal Name is: " + this.name + "\n" + "Animal eats: " + this.food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
    //now we've created a blueprint for creating animals that can be used
}

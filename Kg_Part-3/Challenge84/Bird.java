package in.kkcoding.Challenge84;

public abstract class Bird implements Flyable{
    private final String breed;

    public Bird(String breed)   //this is the "super constructor" for the Eagle class here...
    {
        this.breed=breed;
    }

    public String getBreed()
    {
        return breed;
    }

    // not use because Bird class is abstract type... we can use directly, only use like the base class and implement according to use-cases :
//    @Override
//    public void fly()
//    {
//        System.out.println("Birl flying...");
//    }


}

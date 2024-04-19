public class CreateFinalObjCunstr   //create car class for example (Immutable class)...
{
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    CreateFinalObjCunstr (int noOfWheels, String model, String engineInLiters)
    {
        this.noOfWheels=noOfWheels;
        this.model=model;
        this.engineInLiters=engineInLiters;
       // noOfWheels++;                           //throws error becase final variable can;t be change after once the initializer runs...
    }

    @Override
    public String toString() {
        return " Total Wheels: "+noOfWheels+"\n Model: "+model+"\n Engine Capacity: "+engineInLiters;
    }

    public static void main(String[] args) {
        CreateFinalObjCunstr car= new CreateFinalObjCunstr(4, "BN2024", "20Lt");   //intialize at the time of object creation...
        System.out.println(car);
    }
}

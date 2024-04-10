package in.kkcoding.Challenge81;

public class TestPersonClass {
    public static void main(String[] args) {
        Person p1= new Person("Krishna", 22);
        Person p2= new Person("Krishna", 22);

        if(p1 == p2)  // compares the references...
            System.out.println("Equals(ref)...");
        else if (p1.equals(p2))   //overriden method in Person class...
        {
            System.out.println("Equals(values)...");
        } else
            System.out.println("not Equals...");
    }
}

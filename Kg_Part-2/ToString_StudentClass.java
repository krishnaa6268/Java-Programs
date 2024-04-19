public class ToString_StudentClass {
    String name;
    int age;

    ToString_StudentClass(String name, int age){
        this.name=name;
        this.age=age;
    }
 
    @Override
    public String toString() {
        return "Student Details: {Name: "+name
                              +", Age: "+age
                              +"}";
    }

    public static void main(String[] args) {
        ToString_StudentClass st=new ToString_StudentClass("Krishna", 22);
        System.out.println(st);
    }

}
  
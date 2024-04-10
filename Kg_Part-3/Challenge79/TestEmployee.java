package in.kkcoding.Challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp= new Employee("Krishna", 22, 45000);
        System.out.println(emp.getEmployeeDetails());

        emp.setName("Vivek");
        System.out.println(emp.getSalary());

        System.out.println(emp.getEmployeeDetails());    }
}

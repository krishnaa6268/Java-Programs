package in.kkcoding.Challenge79;

class Employee {
    private String name;
    private int age;
    private int salary;


     Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails()
    {
        return "Employee Details: Name: "+name
                               +", Age: "+age
                            +", Salary: "+salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

package in.kkcoding.Challenge114;

import in.kkcoding.Challenge80.LibraryItem;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> emp= List.of(
                new Employee("RAM",55000),
                new Employee("HARI",1500),
                new Employee("SHYAM",30050),
                new Employee("MOHAN",5010),
                new Employee("KRISHNA",7080)
                );
        emp.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);

        System.out.println("Another way:");
        emp.stream()
                .sorted((emp1, emp2) ->emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}

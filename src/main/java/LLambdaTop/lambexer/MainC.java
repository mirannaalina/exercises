package LLambdaTop.lambexer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainC {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jogn",50));
        employees.add(new Employee("se",30));
        employees.add(new Employee("erf",20));

        for(Employee emp : employees){
            System.out.println(emp.getName());
        }

        System.out.println("======");

        Collections.sort(employees, (Employee em1, Employee em2) -> em1.getName().compareTo(em2.getName()));

    }
}

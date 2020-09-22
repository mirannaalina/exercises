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

        Collections.sort(employees, (Employee employee1, Employee employee2));
    }
}

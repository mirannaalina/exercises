package LLambdaTop.lambexer;

import lombok.Data;

@Data
public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

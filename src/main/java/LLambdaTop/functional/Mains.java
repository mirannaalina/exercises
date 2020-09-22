package LLambdaTop.functional;

import java.util.ArrayList;
import java.util.List;

public class Mains {

    public static void main(String[] args) {

        Employee john = new Employee("john",23);
        Employee  sol = new Employee("sol",22);
        Employee al = new Employee("al",66);
        Employee cri = new Employee("cri",11);

        List<Employee>  employeeList = new ArrayList<>();

        employeeList.add(john);
        employeeList.add(sol);
        employeeList.add(al);
        employeeList.add(cri);

        //object in, nothing out
        //consumer
//        employeeList.forEach(employee ->{
//            System.out.println(employee.getAge());
//            System.out.println(employee.getName());
//        } );

//        for(Employee employee : employeeList){
//            if(employee.getAge()>30){
//                System.out.println(employee.getName());
//            }
//        }

        employeeList.forEach(employee -> {
            if(employee.getAge()>30){
                System.out.println(employee.getName());
            }
        });
    }
}

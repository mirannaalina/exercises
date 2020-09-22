package LLambdaTop.lambexer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainC {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jogn", 50));
        employees.add(new Employee("se", 30));
        employees.add(new Employee("erf", 20));

        for (Employee emp : employees) {
            System.out.println(emp.getName());
            new Thread(()-> System.out.println(emp.getAge())).start();
        }

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

        System.out.println("======");

        Collections.sort(employees, (Employee em1, Employee em2) -> em1.getName().compareTo(em2.getName()));}




    public void doStuff() {

    }
    public static String doSomething(String s){
        return s;
    }




}

interface UpperConcat{
        public String upperConcat(String s1, String s2);

}




class AnotherClass{
    public String dosomething(){
        return MainC.doSomething("fa");
    }

    public void printValue(){
        int number=5;
        Runnable r = ()->{
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("the value is "+number);
        };
        new Thread(r).start();
    }
}

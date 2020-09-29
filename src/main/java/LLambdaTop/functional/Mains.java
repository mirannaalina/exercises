package LLambdaTop.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Mains {

    public static void main(String[] args) {

        Employee john = new Employee("john ss",23);
        Employee  sol = new Employee("sol rrt",22);
        Employee al = new Employee("al gg",66);
        Employee cri = new Employee("cri ooo",11);

        List<Employee>  employeeList = new ArrayList<>();

        employeeList.add(john);
        employeeList.add(sol);
        employeeList.add(al);
        employeeList.add(cri);

        printEmployeesByAge(employeeList, "employer younger than 25 ", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()<25;
            }
        });

        //predicate


        IntPredicate intp = i -> i>15;
        System.out.println(intp.test(10));
        int a=20;
        System.out.println(intp.test(a+5));
        System.out.println("----------------------------------");


        //supplier

        Random random = new Random();
        Supplier<Integer> randomSupplier = ()->random.nextInt(1000);
        for(int i=0;i<10;i++){
            System.out.println(random.nextInt(1000));
            System.out.println(randomSupplier.get() );
        }

        System.out.println("-------------------------");
        //get last name from list

        //function
        Function<Employee, String> getLastName = (Employee employee)->{
            return employee.getName().substring(employee.getName().indexOf(' ')+1);
        };

        String lastName = getLastName.apply(employeeList.get(1));
        System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee employee)-> {
            return employee.getName().substring(0,employee.getName().indexOf(' '));
        };

        System.out.println("------------------------");
        //uppercase function

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstName = name-> name.substring(0,name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(firstName);
        System.out.println(chainedFunction.apply(employeeList.get(0)));

        //bifunction

        BiFunction<String, Employee, String> concatAge = (String name, Employee employee)->{
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employeeList.get(0));
        System.out.println(concatAge.apply(upperName,employeeList.get(0)));

        //intunartoperator

        IntUnaryOperator incBy5 = i->i+5;
        System.out.println(incBy5.applyAsInt(10));


        //consumer

        Consumer<String> s1 = s-> s.toUpperCase();
        Consumer<String> s2 = s-> System.out.println(s);
        s1.accept("hey");
        s2.accept("hello ");


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

        Random random1 = new Random();
        for (Employee employee : employeeList){
            if(random1.nextBoolean()){
                System.out.println(getAName(getFirstName,employee));
            }else{
                System.out.println(getAName(getLastName,employee));
            }
        }
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println("over 30 ");
//        for(Employee employee :employees){
//            if(ageCondition.test(employee)){
//                System.out.println(employee.getName());
//           }
//        }
        employees.forEach(employee -> {
            if (employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        });

    }
    private static String getAName(Function<Employee, String> getName, Employee employee){
        return "S";
    }
}

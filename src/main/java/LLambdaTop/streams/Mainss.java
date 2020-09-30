package LLambdaTop.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mainss {
    public static void main(String[] args) {

        List<String> someBingoNumbers = Arrays.asList("N23","F34","T67","U78","G34","G66","g33");

        List<String> gNumbers = new ArrayList<>();


        someBingoNumbers.forEach(number -> {
            if(number.toUpperCase().startsWith("G")){
                gNumbers.add(number);
                System.out.println(number);
                //System.out.println(gNumbers);
            }
        });
        System.out.println(".................");

        gNumbers.sort((String s1, String s2)-> s1.compareTo(s2));
        gNumbers.forEach((String s) -> System.out.println(s));

        System.out.println(".............streams: ");


        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
        System.out.println("=======================");
        Stream<String> ioNumber = Stream.of("I23","I67","I88","I99");
        Stream<String> inNumber = Stream.of("N56","N98");
        Stream<String> concatStream = Stream.concat(ioNumber,inNumber);
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)//print all the values
                .count());//count the values

        System.out.println("-------------------------");

        Employee jhon = new Employee("Joeh Doe", 30);
        Employee seh = new Employee("seh daas", 40);
        Employee asa = new Employee("asa lrr", 69);
        Employee merea = new Employee("merea los", 50);

        Department hr = new Department("Human REs");
        hr.addEmployee(jhon);
        hr.addEmployee(seh);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(asa);
        accounting.addEmployee(merea);


        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        //echiv
        for(String s: sortedGNumbers){
            System.out.println(s);
        }


        Map<Integer, List<Employee>> groupByAge =  departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee->employee.getAge()));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2)-> e1.getAge()<e2.getAge() ? e1 :e2)//youngest employee
                .ifPresent(System.out::println);

        System.out.println("----------------------------");

        //nothing will output without terminal operation

        Stream.of("ABC","CA","BAA","CCC","Xy")
                .filter(s -> {
                    System.out.println(s);
                    return s.length()==3;
                })
        .count();//count method terminal operation

    }
}

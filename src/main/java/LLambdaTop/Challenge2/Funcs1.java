package LLambdaTop.Challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class Funcs1 {

    public static void main(String[] args) {

//sorted order
        List<String> topnames = Arrays.asList("Amelia","Olivia","Emily","jacob","jarry");


        List<String> firstUpperCaseList = new ArrayList<>();
        topnames.forEach(name->
            firstUpperCaseList.add(name.substring(0,1).toUpperCase()+name.substring(1)));
           // firstUpperCaseList.sort((s1,s2)->s1.compareTo(s2));
           // firstUpperCaseList.forEach(s-> System.out.println(s));

//using method ref

         //firstUpperCaseList.sort(String::compareTo);
         //firstUpperCaseList.forEach(System.out::println);


//using stream to sort names

        topnames
                .stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

//counting the numbers of names

        long namesBeginningWithA =  topnames
                                         .stream()
                                            .map(name-> name.substring(0,1).toUpperCase()+ name.substring(1))
                                               .filter(name-> name.startsWith("A"))
                                                 .count();

        System.out.println("Numbers of names beginning with A is "+ namesBeginningWithA);

//peek
   //nothing happens if no terminal operation is in the end
       topnames
       .stream()
       .map(name-> name.substring(0,1).toUpperCase()+name.substring(1))
       .peek(System.out::println)
       .sorted(String::compareTo)
       //.count();
       //or collect is a terminal operation
        .collect(Collectors.toList());




    }


}

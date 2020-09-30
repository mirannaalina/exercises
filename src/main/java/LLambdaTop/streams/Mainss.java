package LLambdaTop.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    }
}

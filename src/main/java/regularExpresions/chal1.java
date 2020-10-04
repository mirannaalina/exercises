package regularExpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class chal1 {

    public static void main(String[] args) {

        String challenge1 = "I want a bike";
        String challenge2 = "I want a ball";
        System.out.println(challenge1.matches("I want a bike"));


        String regExp = "I want a \\w+.";
        System.out.println(challenge2.matches(regExp));
        String regexp1 = "I want a (bike|ball)";
        System.out.println(challenge2.matches(regExp));
        System.out.println(challenge2.matches(regexp1));

        String regExp3= "I want a \\w+.";
        Pattern pattern= Pattern.compile(regExp3);
        Matcher matcher= pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches() );


        String challenge4= "Replace all blanks with underscore.";
        System.out.println(challenge1.replaceAll(" ","_"));
        System.out.println(challenge4.replaceAll("\\s","_"));


        String challenge5 ="aaabccccccccefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));


        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        String challenge7 ="abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

        String challenge8="abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 =  pattern8.matcher(challenge8);
        while(matcher8.find()){
            System.out.println("Occurence + "+matcher8.group(1));
        }

        String challenge9="abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while(matcher9.find()){
            System.out.println("Occurence + "+matcher9.group(1));
        }


        String challenge11 ="{0,2},{0,5},{1,3},{2,4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()){
            System.out.println("Occurance  "+matcher11.group(1));
        }

        System.out.println("000000000000");
        String challenge11a ="{0,2},{0,5},{1,3},{2,4} {x,y}, {2,4}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while(matcher11a.find()){
            System.out.println("Occurance  "+matcher11a.group(1));
        }

        String challenge12 ="11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        String challenge13 ="11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));


        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));


    }
}

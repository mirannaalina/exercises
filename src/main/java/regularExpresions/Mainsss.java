package regularExpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mainsss {

    public static void main(String[] args) {

        //regular expression
        String string =  "I am a string. Yes I am.";
        System.out.println(string);
        String yourString =string.replaceAll("I","You");
        System.out.println(yourString);

        String alphanumeric = "abCDeeeF12Ghhijkl99z";

        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));

        String secondString = "abCDeeeF12Ghhijkl99zssssss";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));
        System.out.println(secondString.substring(1,2));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abCDeeeF12Ghhijkl99z "));

        System.out.println("///////////////////////// ");

        System.out.println("Harry".replaceAll("[Hh]arry","Harry"));

        StringBuilder htmlText = new StringBuilder("<h1> My Heading </h1>");
        htmlText.append("<h2>Sub heading</h2>");

        String h2Pattern ="<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        //.* -one or more
        int count=0;
        while(matcher.find()){
            count++;
            System.out.println("Occurrence "+ count +": "+ matcher.start()+" to "+ matcher.end());
        }
    }
}

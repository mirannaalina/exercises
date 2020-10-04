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

        // (123) 456-7890
        //pt ( = [\\(]{1}
        //pt 3 cifre = [0-9]{3}
        //pt spatiu gol = [ ]{1}
        //pt alte 3 cifre= [0-9]{3}
        //pt linie= [\\-]{1}
        //pt alte 4 cifre = [0-9]{4}

        String phone1 = "1234567890"; //shouldn/t match
        String phone2 = "(123) 456-7890"; //should match
        String phone3 = "123 456-7890"; //shouldn/t match
        String phone4 = "(123)456-789"; //shouldn t match

        System.out.println("phone1 = "+ phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = "+ phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        System.out.println("phone3 = "+ phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = "+ phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

    }
}

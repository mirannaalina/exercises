package test;

public class StringUtilities {

    private StringBuilder stringBuilder = new StringBuilder();
    private int charAdded =0;

    public void addChar(StringBuilder stringBuilder, char c){
     this.stringBuilder.append(c);
    charAdded++;
    }


    public String upperAndPrefix(String str){
        String upper = str.toUpperCase();
        return "Prefix__"+upper;
    }

    public String addSuffix(String str){
        return str+"__Suffix";
    }

}

package testChallenge;

public class Utilities {

    //return a char array containing every nth charh.
    //when sourceArray length < n re4turns sourceArray
    public char[] everyNthChar(char[] sourcearray, int n){
        if(sourcearray==null || sourcearray.length <n){
            return sourcearray;
        }

        int returnedLength = sourcearray.length /n;
        char[] result = new char[returnedLength];
        int index=0;

        for(int i =n-1; i< sourcearray.length; i +=n){
            result[index++] = sourcearray[i];
        }

        return result;
    }

    ////removes pairs of the same character
    //ABCDEEF - >ABCDEF
    //if are next toeach other. if not they are not removed

    public String removePairs(String source){

        if(source ==null ||source.length()<2){
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for(int i=0; i< string.length-1;i++){

            System.out.println(string[i]);

            if(string[i] !=string[i+1]){
                sb.append(string[i]);
            }
        }
        //System.out.println(string.length-1);
        //sb.append(string.length-1);
        return sb.toString();
    }



    public int converter(int a, int b){
        return(a/b)+ (a*30)-2;
    }

    public String nullIfOddLength(String source){
        if(source.length()%2==0){
            return source;
        }
        return null;
    }
}

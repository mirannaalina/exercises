package testChallenge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UtilitiesParameterized {

    private Utilities util;

    private String input;
    private String output;

    public UtilitiesParameterized(String output, String input) {
        this.output = output;
        this.input=input;
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[][] {
                {"ABCDEF","ABCDEF"},
                {"AB88EFG","AB8EFG"},
                {"112233445566","123456"},
                {"A","A"}
        });
    }

    @Test
    public void removePairs()throws Exception{
       // assert

    }

}

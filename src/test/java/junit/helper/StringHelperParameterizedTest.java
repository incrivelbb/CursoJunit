package junit.helper;

import junit.StringHelper;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    StringHelper helper = new StringHelper();
    String input;
    String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutputs[][] = { {"AAD", "CD"}, {"ACD", "CD"} };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void ut00_testTruncateInFirst2Positions_AInFirst2Positions() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }


    @Test
    public void ut02_testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABC"));
    }

    @Test
    public void ut03_testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @After
    public void tearDown(){
        System.out.println("Teste Finalizado!");
    }


}
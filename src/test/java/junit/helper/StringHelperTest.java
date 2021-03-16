package junit.helper;

import junit.StringHelper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper helper;

    @Before
    public void setUp() {
        helper = new StringHelper();
        System.out.println("Iniciando Testes..");
    }

    @Test
    public void ut00_testTruncateInFirst2Positions_AInFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void ut01_testTruncateInFirst2Positions_AInFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
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
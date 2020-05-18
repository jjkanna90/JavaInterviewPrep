package org.prep.arrays;

import org.junit.Assert;
import org.junit.Test;

public class UniqueCharactersTest {

    @Test
    public void test_checkUnique_BaseCase(){
        String input = "Helo";
        boolean expOutput = true;
        boolean actOutput = new UniqueCharacters().checkUnique(input);
        Assert.assertEquals(expOutput,actOutput);
    }

    @Test
    public void test_checkUnique_NegativeCase(){
        String input = "Hello";
        boolean expOutput = false;
        boolean actOutput = new UniqueCharacters().checkUnique(input);
        Assert.assertEquals(expOutput,actOutput);
    }

    @Test
    public void test_checkUniqueWithBitVector_BaseCase(){
        String input = "Helo";
        boolean expOutput = true;
        boolean actOutput = new UniqueCharacters().checkUniqueUsingBitVector(input);
        Assert.assertEquals(expOutput,actOutput);
    }

    @Test
    public void test_checkUniqueWithBitVector_NegativeCase(){
        String input = "Hello";
        boolean expOutput = false;
        boolean actOutput = new UniqueCharacters().checkUniqueUsingBitVector(input);
        Assert.assertEquals(expOutput,actOutput);
    }
}

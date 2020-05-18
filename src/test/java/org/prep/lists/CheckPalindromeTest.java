package org.prep.lists;

import org.junit.Test;
import org.prep.utility.ListUtility;
import org.prep.utility.SListNode;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    @Test
    public void testPalindromeCheck_EvenCase_True(){
        SListNode input = ListUtility.convArrayToSList(new char[]{'s','a','m','m','a','s'});
        assertEquals(true,new CheckPalindrome().palindromeCheck(input));
    }

    @Test
    public void testPalindromeCheck_EvenCase_False(){
        SListNode input = ListUtility.convArrayToSList(new char[]{'s','a','m','m','d','s'});
        assertEquals(false,new CheckPalindrome().palindromeCheck(input));
    }

    @Test
    public void testPalindromeCheck_OddCase_True(){
        SListNode input = ListUtility.convArrayToSList(new char[]{'s','a','m','d','m','a','s'});
        assertEquals(true,new CheckPalindrome().palindromeCheck(input));
    }

    @Test
    public void testPalindromeCheck_OddCase_False(){
        SListNode input = ListUtility.convArrayToSList(new char[]{'s','a','m','d','m','a','d'});
        assertEquals(false,new CheckPalindrome().palindromeCheck(input));
    }

}
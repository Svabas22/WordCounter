package com.example.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import Classes.CountChar;


public class CountCharUnitTest {
    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_countCharLengthIsCalled_Then_NullPointerExceptionIsThrown(){
        CountChar.getCharLength(null);
    }

    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_wordCountIsCalled_Then_NullPointerExceptionIsThrown(){
        CountChar.getWordCount(null);
    }

    @Test
    public void Given_EmptyString_When_countCharLengthIsCalled_Then_ReturnedEmptyString(){
        final String givenString = "";

        final String expectedResult = String.valueOf(0);
        final String actualResult = String.valueOf(CountChar.getCharLength(givenString));

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_EmptyString_When_wordCountIsCalled_Then_ReturnedEmptyString(){
        final String givenString = "";

        final String expectedResult = String.valueOf(0);
        final String actualResult = String.valueOf(CountChar.getWordCount(givenString));

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_String_When_countCharLengthIsCalled_Then_ReturnedStringCharCount(){
        final String givenString = "many many characters";

        final String expectedResult = String.valueOf(18);
        final String actualResult = String.valueOf(CountChar.getCharLength(givenString));

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_String_When_wordCountIsCalled_Then_ReturnedStringWordCount(){
        final String givenString = "many many words";

        final String expectedResult = String.valueOf(3);
        final String actualResult = String.valueOf(CountChar.getWordCount(givenString));

        assertEquals(expectedResult, actualResult);
    }

}

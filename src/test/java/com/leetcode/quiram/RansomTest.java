package com.leetcode.quiram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RansomTest {
    @ParameterizedTest
    @CsvSource(value = {
            "a,b,false",
            "aa,ab,false",
            "aa,aab,true"
    })
    void test(String ransomNote, String magazineNote, boolean expectedAnswer) {
        final RansomNote subject = new RansomNote();
        assertEquals(expectedAnswer, subject.canConstruct(ransomNote, magazineNote));
    }
}
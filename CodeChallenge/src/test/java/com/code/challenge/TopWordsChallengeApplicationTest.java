package com.code.challenge;

import com.code.challenge.application.TopWordsChallengeApplication;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TopWordsChallengeApplicationTest.
 */
public class TopWordsChallengeApplicationTest {
    @Test
    public void top_3_words_string_one() {
        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWordsChallengeApplication.identifyTopWords("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
    }

    @Test
    public void top_3_words_string_two() {
        assertEquals(Arrays.asList("won't", "wont"),  TopWordsChallengeApplication.identifyTopWords("  //wont won't won't "));
    }

    @Test
    public void top_3_words_string_three() {
        assertEquals(Arrays.asList(), TopWordsChallengeApplication.identifyTopWords("  '''  "));
    }

    @Test
    public void top_3_words_string_four() {
        assertEquals(Arrays.asList("a", "of", "on"),  TopWordsChallengeApplication.identifyTopWords(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n")) ));    }

}


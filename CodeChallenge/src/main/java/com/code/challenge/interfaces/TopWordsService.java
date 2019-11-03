package com.code.challenge.interfaces;

import java.util.List;

public interface TopWordsService {

    /**
     * Returns topWords By Occurrences when given a text.
     *
     * @param text
     * @return
     */
    List<String> topWordsByOccurrences(String text);
}

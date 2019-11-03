package com.code.challenge.services;

import com.code.challenge.interfaces.TopWordsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Top words are evaluated - returns an array of the top-3 most occurring words,
 */
@Service
public class TopWordsServiceImpl implements TopWordsService {

    private static final String REGEX = ".*[a-zA-Z].*";
    private static final String PATTERN = "[^a-zA-Z0-9\\s']";

    /**
     * Returns an empty list if the given input string does not contain any alphabets.
     *
     * @param list
     * @return
     */
    public static boolean isContainingLetters(List<String> list) {
        for (String s : list) {
            if (s.matches(REGEX)) return true;
        }
        return false;
    }

    @Override
    public List<String> topWordsByOccurrences(String s) {

        final String inputText = StringUtils.normalizeSpace(s);
        String text = inputText.replaceAll(PATTERN, "");
        String[] words = Stream.of(text.toLowerCase().split(" ")).filter(w -> !w.isEmpty()).toArray(String[]::new);

        ArrayList<String> finalList = new ArrayList<String>();
        if (!isContainingLetters(Arrays.asList(words))) {
            //below system out is only used for displaying results in command promt.
            System.out.println("The result is : "+Arrays.toString(finalList.toArray()));
            return finalList;
        }

        Map<String, Integer> wordsMap = new TreeMap<>();
        for (String word : words) {
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 1);
            } else {
                int value = wordsMap.get(word);
                value++;
                wordsMap.put(word, value);
            }
        }
        List<String> orderedList = wordsMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        Collections.reverse(orderedList);

        int i;
        int maxSize = 2;
        for (i = 0; i < orderedList.size(); i++) {
            if (i <= maxSize) {
                finalList.add(orderedList.get(i));
            }
        }
        //below system out is only used for displaying results in command promt.
        System.out.println("The result is : "+Arrays.toString(finalList.toArray()));
        return finalList;
    }
}


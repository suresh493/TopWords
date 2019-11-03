package com.code.challenge.application;

import com.code.challenge.services.TopWordsServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * This application has been created as a springboot application.
 *
 * Application that returns an array of the top-3 most occurring words,
 * in descending order of the number of occurrences.
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.code.challenge")
public class TopWordsChallengeApplication extends SpringBootServletInitializer {
    public static void main(final String[] args) {
        SpringApplication.run(TopWordsChallengeApplication.class, args);
        try {
            System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
            identifyTopWords(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please provide valid string.");
        }
    }

    public static List<String> identifyTopWords(String text) {

        try {
            System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
            return new TopWordsServiceImpl().topWordsByOccurrences(text);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please provide valid string.");
        }
        return null;
    }


}
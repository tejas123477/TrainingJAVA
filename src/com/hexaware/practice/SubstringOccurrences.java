package com.hexaware.practice;

import java.util.Arrays;

public class SubstringOccurrences {

    public static int findAllOccurrences(String text, String substring) {
        int[] occurrences = new int[0];
        int index = text.indexOf(substring);

        int c=0;
        // Continue searching for occurrences until indexOf returns -1
        while (index != -1) {
            occurrences = Arrays.copyOf(occurrences, occurrences.length + 1);
            c++;
            occurrences[occurrences.length - 1] = index;
            index = text.indexOf(substring, index + substring.length());
        }

        return c;
    }
    public static void main(String[] args) {
        String text = "Java is a Java powerful";
        String substringToSearch = "Java";

        int occurrences = findAllOccurrences(text, substringToSearch);

        if (occurrences>0) {
            System.out.println("No of Occurrences is '" + occurrences);
        } else {
            System.out.println("No occurrences found.");
        }
    }
}

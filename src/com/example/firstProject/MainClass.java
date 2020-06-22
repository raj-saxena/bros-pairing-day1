package com.example.firstProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList("apple", "boy", "gajodhar", "panther");
        // print input
        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(inputs.get(i));
        }
        // takes list => outputs list after capitalization

        List<String> outputs = capitalize(inputs);
        // print output
        for (int i = 0; i < outputs.size(); i++) {
            System.out.println(outputs.get(i));
        }
    }

    // int, byte, short, char, double, long, float, boolean
    // Integer, Byte, Short, Character, Double, Long, Float, Boolean
    private static List<String> capitalize(List<String> inputs) {
        List<String> outputs = new ArrayList<>();
        for (int i = 0; i < inputs.size(); i++) {
            String item = inputs.get(i);
            // capitalise first character + rest of the string.
            char first = item.charAt(0);
            char firstCapitalized = Character.toUpperCase(first);
            // part of String
            String substring = item.substring(1);
            String converted = Character.toString(firstCapitalized).concat(substring);
            outputs.add(converted);
        }
        return outputs;
    }

    // Receive a list of names and capitalize the first letter
    // "apple", "boy", "gajodhar", "panther" -> "Apple", "Boy", "Gajodhar", "Panther"
}

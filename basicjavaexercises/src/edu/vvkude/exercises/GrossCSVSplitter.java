package edu.vvkude.exercises;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrossCSVSplitter {

    private static final char DEFAULT_DELIMITER = ',';
    private static final char DEFAULT_QUOTE = '"';

    public static void main(String[] args) throws Exception {

        String csvFile = "/Users/vkudesia/badBookAuthors.csv";

        Scanner scanner = new Scanner(new File(csvFile));
        while (scanner.hasNext()) {
            List<String> line = parseLine(scanner.nextLine());
            System.out.println("Book Item [Title = " + line.get(0) + ", Price = " + line.get(1) + " , Author = " + line.get(2) + "]");
        }
        scanner.close();

    }

    public static List<String> parseLine(String cvsLine) {
        return parseLine(cvsLine, DEFAULT_DELIMITER, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char delimiters) {
        return parseLine(cvsLine, delimiters, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char delimiters, char customQuote) {

        List<String> result = new ArrayList<>();

        //What do we do if the list is empty? Return it
        if (cvsLine == null && cvsLine.isEmpty()) {
            return result;
        }

        if (customQuote == ' ') {
            customQuote = DEFAULT_QUOTE;
        }

        if (delimiters == ' ') {
            delimiters = DEFAULT_DELIMITER;
        }

        StringBuffer currentValue = new StringBuffer();
        // Initialize varaibles to check for quoted csv elements
        // and to check for double quotes within csv elements
        // I suppose we could check strings against a regex, instead
        boolean isInQuotes = false;
        boolean hasStartCollectChar = false;
        boolean hasDoubleQuotesInColumn = false;

        char[] chars = cvsLine.toCharArray();

        for (char ch : chars) {
        	
        	// Start with checking for csv elements in quotes
            if (isInQuotes) {
                hasStartCollectChar = true;
                // Check for a custom quote character
                if (ch == customQuote) {
                    isInQuotes = false;
                    hasDoubleQuotesInColumn = false;
                } else {
                	// mark that there are double quotes in a csv column
                    if (ch == '\"') {
                        if (!hasDoubleQuotesInColumn) {
                            currentValue.append(ch);
                            hasDoubleQuotesInColumn = true;
                        }
                    } else {
                        currentValue.append(ch);
                    }

                }
            } else {
                if (ch == customQuote) {
                	
                    isInQuotes = true;
                    if (chars[0] != '"' && customQuote == '\"') {
                        currentValue.append('"');
                    }

                    // search for double quotes in a column
                    if (hasStartCollectChar) {
                        currentValue.append('"');
                    }

                } else if (ch == delimiters) {

                    result.add(currentValue.toString());

                    currentValue = new StringBuffer();
                    hasStartCollectChar = false;

                } else if (ch == '\r') {
                    continue;
                // If we hit a newline, break out of the control structure
                } else if (ch == '\n') {
                    break;
                } else {
                    currentValue.append(ch);
                }
            }

        }

        result.add(currentValue.toString());

        return result;
    }

}
/*
 * Java_06_RegularExpressions.java
 *
 * created at Sep 8, 2017 by iv.ivanov <iv.ivanov@seeburger.de>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package Java_Advanced_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Regular Expressions Practical Examples
 *
 * @author Ivan Ivanov(cryptex)
 */
public class Java_06_RegularExpressions
{

    public static void main(String[] args) throws IOException
    {
        /*
         * Regular expressions are sequence of characters that forms a
         * search pattern.
         * Example: (?<=\.) {2,}(?=[A-Z])
         *
         * Used for finding and matching certain parts of strings.
         *
         * Search pattern describe what should be matched.
         *
         * Java library supports regular expressions.
         */
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("aaaab");
        while (matcher.find()) // matcher.find - searches for the next match
        {
            System.out.println(matcher.group()); // gets the matched text
        }

        System.out.println();

        /*
         * Small problem. Find all the occurrence count of word "regex" in a regex.txt
         */
        Pattern pattern1 = Pattern.compile("regex");
        File regexFile = new File("resources/filesToRead/regex.txt");
        int occurrences = 0;
        try
        {
            BufferedReader bf = new BufferedReader(new FileReader(regexFile));
            String line = "";
            while ((line = bf.readLine()) != null)
            {
                Matcher matcher2 = pattern1.matcher(line);
                while(matcher2.find())
                {
                    occurrences++;
                }

            }

        }
        catch (FileNotFoundException e)
        {
            System.err.println("File " + regexFile.getName() + " not found!!!");
        }

        System.out.println("Number of occurrences of 'regex' in regex.txt file: " + occurrences);

        System.out.println();

        String text1 = "Ivan Ivanov";
        Pattern pat1 = Pattern.compile("[aeiouy]"); // [aeiouy] - matches lowercase vowel. Can replace with [a-z]
        Matcher mat1 = pat1.matcher(text1);
        while (mat1.find())
        {
            System.out.println("Found vowel: " + mat1.group());
        }

        System.out.println();

        String text2 = "In 1519 Leonardo da Vinci died at the age of 67.";
        Pattern pat2 = Pattern.compile("[0123456789]");// can replace with [0-9]
        Matcher mat2 = pat2.matcher(text2);
        while (mat2.find())
        {
            System.out.println("Found number: " + mat2.group());
        }

        System.out.println();
        // . - matches any symbol.
        System.out.println("Number of occurrences in the given text is: " + findVowelsInAText("Abraham Lincoln"));
        System.out.println("Number of occurrences in the given text is: " + findVowelsInAText("In 1519 Leonardo "
                        + "da Vinci died at the age of 67."));

        // [^aeiouy] - matches anything except lowercase vowel.
        // [^0-9] - matches anything except digits from 0 to 9.

        /*
         * Shorthand character classes
         * \d -> shorthand for [0-9]
         * \w -> shorthand for [a-zA-Z0-9_]
         * \s -> matches any white-space character(space, tab, line break)
         * \D -> shorthand for [^0-9]
         * \W -> shorthand for [^a-zA-Z0-9_]
         * \S -> matches any non white-space character
         */

        /*
         * Quantifiers
         *
         * + -> matches the previous element one or more times
         * * -> matches previous element zero or more times
         * ? -> matches previous element zero or one time
         * {min length, max length} - exact quantifiers
         */


        System.out.println();
        /*
         * Example problem
         *
         * Extract all integer numbers from a given text
         * Ignore signs or decimal separators.
         */
        String text3 = "In 1519 Leonardo da Vinci died at the age of 67.";
        Pattern pat3 = Pattern.compile("\\d+");
        Matcher mat3 = pat3.matcher(text3);
        while (mat3.find())
        {
            System.out.println("Found number: " + mat3.group());
        }

        System.out.println();
        /*
         * Example problem
         *
         * Extract all tags from a given HTML
         * Read until an END command.
         */
        String givenHTML = "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "  <head>\n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "    <title></title>\n" +
                        "  </head>\n" +
                        "  <body>\n" +
                        "    \n" +
                        "  </body>\n" +
                        "</html>";
        Pattern pat4 = Pattern.compile("<.*?>");
        Matcher mat4 = pat4.matcher(givenHTML);
        while (mat4.find())
        {
            System.out.println("Current found HTML tag is: " + mat4.group());
        }

        System.out.println();
        /*
         * \+. matches any character
         */
        String text4 = "+359 885/97-60-02";
        System.out.println("Test . special character:");
        execRegex(text4, "\\+.+");
        System.out.println();

        /*
         * | pipe is a logical OR
         */
        String text5 = String.format("+359 885/97-60-02%n+359-885/97-60-02%n+359/885/97-60-02");
        System.out.println("Test | special character.");
        execRegex(text5, "\\+359( |-).+");

        System.out.println();
        String text6 = String.format("+359 885/97-60-02");
        System.out.println("Test brackets [() special character.");
        execRegex(text6, "\\+([\\d /-]+)");
        
        /*
         * +*? - quantifiers 
         * ^$ - anchors        
         */
        
        // CONSTRUTCTS
        System.out.println();
        String text7 = "01-Aug-1992";
        System.out.println("Testing the following regex: (\\d{2}-(\\w{3})-(\\d{4})");
        execRegex(text7, "(\\d{2})-(\\w{3})-(\\d{4})");
        
        System.out.println();
        String text8 = "08-Sep-2017";
        System.out.println("Testing the following regex: \\d{2}-(?<month>\\w{3})-\\d{4}");
        execRegex(text8, "\\d{2}-(?<month>\\w{3})-\\d{4}");
        
        
        
        System.out.println();
        String text9 = "Today is 08-09-2017";
        String pat10 = "\\d{2}-\\d{2}-\\d{4}";
        boolean containsValidDate = Pattern.matches(text9, pat10);
        System.out.println("Is date: " + text9 + " -> " + containsValidDate);
    }

    public static void execRegex(String text, String patternStr)
    {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find())
        {
            System.out.println("Currently found: " + matcher.group());
        }
    }

    public static int findVowelsInAText(String text)
    {
        int result = 0;
        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find())
        {
            result++;
        }

        return result;
    }
}




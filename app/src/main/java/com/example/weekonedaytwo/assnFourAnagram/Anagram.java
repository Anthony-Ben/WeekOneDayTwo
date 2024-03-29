package com.example.weekonedaytwo.assnFourAnagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String word1 = "TACO";
        String word2 = "COAT";
        String word3 = "LAST";
        boolean isAnagram1 = anagram.checkAnagrams(word1, word2);
        boolean isAnagram2 = anagram.checkAnagrams(word1, word3);
/*
        if(isAnagram){
            System.out.println( word1 + " " + word2 + " are anagrams!");
        }
        else {
            System.out.println(word1 + " " + word2 + " are not anagrams!");
        }
        */
    }

    public boolean checkAnagrams(String word1, String word2) {
        boolean result = false;

        if(word1.length() == word2.length()){
            int totalLength = word1.length();
            char[] unscrambleWord2 = new char[totalLength];
            String compareToWord1;
            //Loop to sort the second String and insert into a char Array if a character matches between word1 and word2
            for (int i = 0; i < totalLength; i++) {
                for (int j = 0; j < totalLength; j++) {
                    if (word1.charAt(i) == word2.charAt(j)) {
                                unscrambleWord2[i] = word2.charAt(j);
                        //System.out.println(unscrambleWord2[i]);
                    }

                }
            }

            compareToWord1 = new String(unscrambleWord2);

            if(compareToWord1.equals(word1)){
                result = true;

                System.out.println(word1 + " and " + word2 + " are anagrams");
            }
            else
            {
                System.out.println(word1 + " and " + word2 + " are not anagrams");
            }
        }
        return result;
    }

}


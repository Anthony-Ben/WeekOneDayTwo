package com.example.weekonedaytwo.assnOneDupString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DuplicateString {


    public static void main(String[] args) {

        DuplicateString pleaseWork = new DuplicateString();

        List<String> testArray = new ArrayList<String>();
            testArray.add("Hello");
            testArray.add("Nothing");
            testArray.add("whar");
            testArray.add("Hello");
            testArray.add("Hello");
            testArray.add("nothing");
            testArray.add("Nothing");

            pleaseWork.findDuplicates(testArray);
    }

    public void findDuplicates(List<String> strings){

        Set<String> duplicateWords = new HashSet<>();

        for(int i = 0; i < strings.size(); i++){
            for(int j = 1; j < strings.size(); j++){
                if(strings.get(i).equals(strings.get(j)) && i != j)
                {
                    //System.out.println(strings.get(i) + i + " " + strings.get(j) + j );
                        duplicateWords.add(strings.get(i));
                }

            }

        }
        String wordList = strings.toString();
        System.out.println("List of words: " + wordList);

        System.out.println();
        System.out.println("Words that are duplicates : ");
        for (String s: duplicateWords) {
            System.out.println(s);
        }
    }

}

package com.example.weekonedaytwo.assnTwoReverseString;

public class ReverseString {

    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();

        String word1 = "racecar";
        String word2 = "AZ";
        String word3 = "NisiOisiN";
        String word4 = "AA";

        reverseString.checkPalindrome(word1);
        reverseString.checkPalindrome(word2);
        reverseString.checkPalindrome(word3);
        reverseString.checkPalindrome(word4);

    }

    public boolean checkPalindrome(String word){

        boolean isPalindrome = true;
        int endPos = word.length() -1;
        int currentPosition = 0;

        while (currentPosition < endPos){

            if (word.charAt(currentPosition)!= word.charAt(endPos)){
                isPalindrome = false;
            }
            currentPosition++;
            endPos--;
        }

        if (isPalindrome){
            System.out.println(word + " is a palindrome!");
        }
        else
        {
            System.out.println(word + " is not a palindrome!");
        }

        return isPalindrome;
    }
}

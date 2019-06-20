package com.example.weekonedaytwo.assnTwoReverseString;

public class ReverseString {

    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        String word = "racecar";

        if(reverseString.checkPalindrome(word)){
            System.out.println(word + " is a palindrome!");
        }
        else
        {
            System.out.println(word + " is not a palindrome!");
        }
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


        return isPalindrome;
    }
}

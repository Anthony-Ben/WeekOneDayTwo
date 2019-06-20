package com.example.weekonedaytwo.assnThreeFizzBuzz;

import java.util.Scanner;

public class FizzBuzz {


    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = scan.nextInt();

        fizzBuzz.FizzBuzz(input);
    }

    public void FizzBuzz (int input){

        if(input % 5 == 0 && input % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if(input % 5 == 0){
            System.out.println("Fizz");
        }
        else if(input % 3 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println();
        }

    }

}

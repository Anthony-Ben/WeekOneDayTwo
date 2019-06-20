package com.example.weekonedaytwo.assnThreeFizzBuzz;

import java.util.Scanner;

public class FizzBuzz {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
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

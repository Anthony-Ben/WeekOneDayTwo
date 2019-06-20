package com.example.weekonedaytwo.assnFiveMultiply;

import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        MultiArray multiArray = new MultiArray();

        multiArray.printTables();
    }

    public void printTables(){

        int[][] table = new int[10][10];
        int rowRunner = 1;
        int colRunner = 1;
        for(int row = 0; row < table.length; row++){
            for(int col = 0; col < table[row].length; col++)
            {
                table[row][col] = rowRunner * colRunner;
                colRunner++;
                System.out.print(table[row][col] + " ");
            }
            rowRunner++;
            colRunner = 1;
            System.out.println();
        }

/*
        for (int row = 0; row < table.length ; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.println();
            }
  */
        }
    }


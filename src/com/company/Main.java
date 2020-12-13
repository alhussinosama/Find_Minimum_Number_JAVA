package com.company;

import java.util.Scanner;

public class Main {

    // generate the scanner
    private static Scanner scanner = new Scanner( System.in);

    public static void main(String[] args) {

        System.out.println( " Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int [] returnedArray = readIntegers( count ); // generate array
        // type this to find the min number
        int returnedMin = findMin( returnedArray) ; // the method to find thr minimum

        System.out.println( "***** The Minimum is : " + returnedMin + " ******");
    }

    // generate a method to create an array

    private static int[] readIntegers( int count) {
        int[] array = new int [ count ] ;

        // enter the number and next int
        for ( int i = 0 ; i< array.length ; i++) {
            System.out.println( " Enter a number : ");

            int number = scanner.nextInt();
            // next line method
            scanner.nextLine();
            // recorde the number in the array
            array[i] = number;
        }
        return array;

    }
    // generate the method to find the minimum value

    private static int findMin( int[] array) {
        int min = Integer.MAX_VALUE;

        for ( int i = 0 ; i < array.length ; i++) {
            int value = array[i];

            if ( value < min ) {
                min = value ;
            }
        }
        return min;
    }
}
















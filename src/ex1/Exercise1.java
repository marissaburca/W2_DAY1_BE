package ex1;

import exceptions.InvalidPositionException;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main ( String[] args ) throws InvalidPositionException {
        // istanzio random per generare numeri casuali
        Random randomNumber = new Random();
        Scanner userInput = new Scanner(System.in); //apro scanner

        int [] random = new int[5]; // creao array di int con lunghezza 5

        //applico ciclo affinché ad ogni posizione venga assegnato un numero random
        for (int i = 0; i < random.length; i++) {
            random[i] =randomNumber.nextInt(10) + 1;
        }

        System.out.println("Welcome, let's interact with an array, that's how it looks now :");
        printArray(random);
        System.out.println("Right now u have to enter the number which corresponds to the position in the array,");
        System.out.println("and then the number which u choosed. Let's start!");

        int position;
        int number;

        do {
            System.out.print("Type the position (it have to be from 1 to 5)");
            position = Integer.parseInt(userInput.nextLine());


            if (position >= 1 && position <= 5) {
                System.out.print("Type the number");
                number = Integer.parseInt(userInput.nextLine());

                random[position - 1] = number;

                System.out.println("The new array looks like");
                printArray(random);

            } else if (position != 0) {
               throw new InvalidPositionException("Position value not accepted. Type a position value from 1 to 5 or 0 for exit.");
            }
        } while (position != 0);

        System.out.println("You are out. Thank you for participation.");

        userInput.close();
    }

        public static void printArray(int[] random) {
            for (int num : random) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }


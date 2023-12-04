package ex2;

import java.util.Scanner;

public class Exercise2 {
    public static void main ( String[] args ){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's calculate the km/l of your car");
        try {

            System.out.print("Type the total amount of km: ");
            double km = userInput.nextDouble();

            System.out.print("Type the number of liters: ");
            double liters = userInput.nextDouble();


            if (liters == 0) {
                throw new IllegalArgumentException("Error: liters can't correspond to 0 (zero)");
            }

            double kmForLiter = km / liters;
            System.out.println("The number of km/l is: " + kmForLiter);
        } catch (java.util.InputMismatchException e) {
            //lo scanner lancia errore quando nota che il tipo di dato inserito
            //non corrisponde a quello atteso
            //"e" variabile che rappresenta eccezione stessa
            System.out.println("Only numbers are accepted");

            //in caso l'utente mette zero nel litri, si finisce in questo blocco catch

        } catch (IllegalArgumentException e)  {  //meteodo chiamato con argomento non valido
            System.out.println(e.getMessage()); // ritorna messaggio di errore di ZeroPerLiterException
        }

        userInput.close();
    }
}

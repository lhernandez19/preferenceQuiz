package edu.wctc;

import java.util.Scanner;

public class Main {
    public static int totalPreference = 0;

    public static void main(String[] args) {
	// write your code here
        int choice = 0;
        int times = 5;
        int option= 0;
        boolean answer;

        String[] choices = {"mild", "spicy", "tea", "coffee", "breakfast", "brunch", "summer", "winter", "paper", "plastic"};
        String[] message ={"Enter 0 for the preference on the left", "Enter 1 for the preference on the right"};

        do{
            System.out.println("Welcome to the Preference Quiz!");
            System.out.println("-------------------------------");
            for(int i = 0; i < times; i++)
            {
                System.out.println("Do you prefer " + choices[choice] + " or " + choices[++choice] + "?");
                System.out.println(message[0] + "\n" + message[1]);
                Scanner scanner = new Scanner(System.in);
                totalPreference += scanner.nextInt();
                ++choice;
            }

            myMethod();

            choice = 0;
            totalPreference = 0;

            System.out.println("Again? Enter 1 to play again, or any other key to exit.");
            Scanner keyboard = new Scanner(System.in);
            option = keyboard.nextInt();
            answer = option >= 1;
        }
        while(answer);


    }

   static void myMethod(){
        if ( totalPreference < 3){
            System.out.println("You score: " + totalPreference);
            System.out.println("You prefer life to be calm and organized");
        }
        else if ( totalPreference == 3)
        {
            System.out.println("You score: " + totalPreference);
            System.out.println("You prefer a good balance in life.");
        }
        else
        {
            System.out.println("You score: " + totalPreference);
            System.out.println("You prefer life to be spontaneous and active");
        }
    }
}

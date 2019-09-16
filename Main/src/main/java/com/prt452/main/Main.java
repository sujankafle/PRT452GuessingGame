package com.prt452.main;
import java.util.Random;
import java.util.Scanner;

public class Main{
    
        public static Scanner scan = new Scanner(System.in);
        public static Random random = new Random();
        public static long from = 1;
        public static long to = 100;
        public static int randomNumber = (int) (random.nextInt((int) (to - from + 1)) + from);
        public static String input = null;
        public static int timesGuessed = 0;
        
    public static void main(String[] args)
    {
        do{
            System.out.printf("Press 'Q' To QUIT or 'S' To START:", from, to);
            char quits = scan.next().charAt(0);
            playOrQuit(quits);
        }while(!numberOrNot(input)|| Integer.parseInt(input) != randomNumber);
        System.out.println("Attempts: "+timesGuessed);
    }
    public static void playOrQuit(char input){
            if(input == 'Q'){
                System.out.println("You have exited the game");
                System.out.println("Attempts: "+timesGuessed);
                System.exit(0);
            }
            else if(input == 'S'){
                System.out.printf("Guess What The Number Is Between 1 TO 100 : ");
               // Scanner scan = new Scanner(System.in);
                String guessedNumber = scan.next();
                greaterOrnot(guessedNumber);
            }
            else{
                System.out.println("Invalid input of Play and Quit");
            }
    }
    public static void matchWithRandomNum(String input, int randomNumber){
        if (Integer.parseInt(input) > randomNumber){
            timesGuessed++;
            System.out.println("Your guess is too high!");
        }
        else if (Integer.parseInt(input) < randomNumber){
            timesGuessed++;
            System.out.println("Your guess is too low!");
        }
        else{
            timesGuessed++;
            System.out.println("You got it!");
            System.out.println("Attempts: "+ timesGuessed);
            System.exit(0);
                        }
}
    public static void greaterOrnot(String input){
            if(numberOrNot(input)){
                    if(Integer.parseInt(input) > 100 || Integer.parseInt(input) < 0){
                    System.out.println("Please enter Integer Value between 1 to 100 !");
                    }
                    else{
                        matchWithRandomNum(input, randomNumber);
                    }
                }
                else{
                    System.out.println("Invalid input! Please enter integer");
                }
    }
    static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException exception)
        {
            return false;
        }

        return true;
    }
}
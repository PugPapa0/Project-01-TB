/********************************************
*	AUTHORS:	Jacob Zamir, Leo Zhang, Travis Becker
* COLLABORATORS: None
*	LAST MODIFIED:	2026-07-05
********************************************/

/********************************************
*	TITLE: Daily Sugar Intake Tracker
*********************************************
*	PROGRAM DESCRIPTION:
*	This program allows a user to input five foods and their sugar content in grams.
 *	It calculates total sugar intake and compares it to a recommended daily limit of 36 grams.
 *	It then outputs whether the user is within or exceeds the recommended limit.
*********************************************
*	ALGORITHM:
*	1. Display welcome message
 * 2. Ask for user name
 * 3. Collect 5 food names
 * 4. Collect sugar values for each food
 * 5. Compute total sugar
 * 6. Compare total to daily limit (36g)
 * 7. Display formatted report and result
*********************************************
*	STATIC METHODS:
* - displayWelcome(): prints program header
*********************************************/

import java.util.Scanner;

public class Main 
{
  /***** CONSTANT SECTION *****/
  // (No global constants used in this program)

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    Scanner input;
    String food1, food2, food3, food4, food5;
    double sugar1, sugar2, sugar3, sugar4, sugar5;
    double totalSugar, difference, dailyLimit;

    /***** INITIALIZATION SECTION *****/
    input = new Scanner(System.in);
    dailyLimit = 36.0;

    /***** INTRO SECTION *****/
    displayWelcome();

    System.out.print("Enter your name: ");
    String userName = input.nextLine();

    System.out.println();
    System.out.println("Hello, " + userName + "!");
    System.out.println("You will enter 5 foods and their sugar content.");
    System.out.println();

    /***** PROCESSING SECTION (INPUT) *****/

    System.out.print("Enter food #1: ");
    food1 = input.nextLine();

    System.out.print("Enter food #2: ");
    food2 = input.nextLine();

    System.out.print("Enter food #3: ");
    food3 = input.nextLine();

    System.out.print("Enter food #4: ");
    food4 = input.nextLine();

    System.out.print("Enter food #5: ");
    food5 = input.nextLine();

    System.out.println();
    System.out.println("Now enter sugar values (in grams).");
    System.out.println();

    System.out.print(food1 + ": ");
    sugar1 = input.nextDouble();

    System.out.print(food2 + ": ");
    sugar2 = input.nextDouble();

    System.out.print(food3 + ": ");
    sugar3 = input.nextDouble();

    System.out.print(food4 + ": ");
    sugar4 = input.nextDouble();

    System.out.print(food5 + ": ");
    sugar5 = input.nextDouble();

    /***** PROCESSING SECTION (CALCULATIONS) *****/
    totalSugar = sugar1 + sugar2 + sugar3 + sugar4 + sugar5;
    difference = totalSugar - dailyLimit;

    /***** OUTPUT SECTION *****/
    System.out.println();
    System.out.println("---------------------------------------");
    System.out.println("|        DAILY SUGAR REPORT           |");
    System.out.println("---------------------------------------");

    System.out.println("User: " + userName);
    System.out.println();

    System.out.printf("%s: %.1f g%n", food1, sugar1);
    System.out.printf("%s: %.1f g%n", food2, sugar2);
    System.out.printf("%s: %.1f g%n", food3, sugar3);
    System.out.printf("%s: %.1f g%n", food4, sugar4);
    System.out.printf("%s: %.1f g%n", food5, sugar5);

    System.out.println();
    System.out.printf("Total Sugar: %.1f g%n", totalSugar);
    System.out.printf("Daily Limit: %.1f g%n", dailyLimit);

    System.out.println();

    if (totalSugar <= dailyLimit) {
      System.out.println("Status: within recommended daily sugar limit.");
      System.out.printf("You are under the limit by %.1f grams.%n", dailyLimit - totalSugar);
    } else {
      System.out.println("Status: exceeded recommended daily sugar limit.");
      System.out.printf("You exceeded the limit by %.1f grams.%n", difference);
    }

    input.close();
    
  }
  /***** STATIC METHODS *****/
  public static void displayWelcome()
  {
    System.out.println("---------------------------------------");
    System.out.println("|     Daily Sugar Intake Tracker      |");
    System.out.println("---------------------------------------");
    System.out.println("This program tracks your daily sugar intake.");
    System.out.println();
  }
}

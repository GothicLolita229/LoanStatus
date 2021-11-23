package m5cw1_linares;
/**
 * Lourdes Linares
 * M5CW1
 * 10.5.2021
 * This program will demo decision structures
 * 
 */

import java.util.Scanner;

public class M5CW1_Linares {

    
    public static void main(String[] args) {
        // call both programs
        //determineLoanStatus();
        compareNames();
    }
    public static void determineLoanStatus() 
    {
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Declare variables
        double salary, yearsOnJob;
        
        //get the annual salary
        System.out.print("Enter your annual salary: ");
        salary = keyboard.nextDouble();
        
        //Get the number of years on the current job.
        System.out.print("Enter the number of years on the current job: ");
        yearsOnJob = keyboard.nextDouble();
        
        //Determine whether the user qualifies
        if (salary >= 30000)
        {
            if (yearsOnJob >=2)
            {
                System.out.println("You qualify for the loan.");
            }
            else
            {
                System.out.println("You must have been on your current");
                System.out.println("job for at least two years to qualify.");
            }
        }
        else
        {
                System.out.println("You must earn at least $30,000");
                System.out.println("per year to qualify.");
                
        }
        
    }
    public static void compareNames()
    
    {
            //Create a scanner object for keyboard input.
            Scanner keyboard = new Scanner (System.in);
            
            //Declare variables to hold two names.
            String name1; 
            String name2;
            
            //prompt the user for two names
            System.out.print("Enter a name (last name first): ");
            name1 = keyboard.nextLine();
            System.out.print("Enter another name (last name first): ");
            name2 = keyboard.nextLine();
            
            //Display the names in alphabetical order.
            System.out.println("Here are the names, listed alphabetically: ");
            if (name1.compareTo(name2) <0 )
            {
                System.out.println(name1);
                System.out.println(name2);
                
            }
            else
            {
                System.out.println(name2);
                System.out.println(name1);
            }
    }
    
    
}

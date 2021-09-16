package mpg_practice;

/**
 *
 * @author hastingn8128
 */
import java.util.Scanner;

public class MPG_Practice 
{

    public static void main(String[] args) 
    {
        // ask user to enter miles driven
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter Miles Driven: ");
        double driven=keyboard.nextDouble();
        //ask user to enter gallons used
        System.out.println("Enter Gallons Used: ");
        double gallonsused=keyboard.nextDouble();
        //Ask user to enter cost per gallon
        System.out.println("Enter Price Per Gallon: ");
        double costpergallon=keyboard.nextDouble();
        //Calculate MPG
        double mpg= Math.round(driven/gallonsused);
        //calculate total gas cost (cost per gallon times gallons entered)
            double totalgas=Math.round(costpergallon*gallonsused);
        //calculate cost per mile 
            double costpermile=Math.round(mpg/costpergallon);
        //Display Miles per gallon
        System.out.println(("Miles Per Gallon: $")+ mpg);
        //Display Total Gas Cost
        System.out.println(("Total Gas Cost: $")+totalgas);
        //Display Cost per mile
        System.out.println(("Price Per Mile: $")+ costpermile);
    }
    
}

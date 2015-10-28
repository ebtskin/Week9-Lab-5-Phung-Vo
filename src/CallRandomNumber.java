//lab 5, using 4 classes with 2 parameters

import java.util.Scanner;

public class CallRandomNumber
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        RandomNumber Lab4 = new RandomNumber();
        RandomOne HighNumber = new RandomOne();
        
        System.out.print("Please choose a low number from 0-5: ");
        int lowNum = input.nextInt();
        
        Lab4.GetANumber(lowNum);
        
        System.out.print("\nPlease choose a high number from 6-10: ");
        int highNum = input.nextInt();
        
        HighNumber.GetANumberHigh(highNum);
        
        System.out.println();
        
        
        
    }
    
    }
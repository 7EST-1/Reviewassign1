package part1;

import java.util.Scanner;


public class PizzaCost1 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        final double labor = 1.5;
        final double  heat = 0.75;
        double size;
        int nump;
        System.out.println(" Enter your pizza in inches: >");
        
        size = s.nextDouble();
        
        System.out.println("Enter the amount of topping for your pizza: >");
        
        nump = s.nextInt();
        
        //calc
        double total;
        total = labor + heat + size * .50 + nump * 0.75;
                System.out.println("Your pizza will cost: >" +total);       
        
        
        
       
    }
    
}

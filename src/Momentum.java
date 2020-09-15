
import java.util.Scanner;


public class Momentum {

    
    public static void main(String[] args) {
        double momentum;
        double mass, velocity;
        
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter object's mass. (in kg) >> ");
        mass= s.nextDouble();
        System.out.print("Enter object's velocity. (in m/second >> ");
        velocity= s.nextDouble();
        
        
        //calc momentum
        momentum = mass * velocity;
        
        //print answer
        
        System.out.println(String.format("The object's momentum is %.2f", momentum));
       
    }
    
}


package part2;

import java.util.Scanner;


public class powerchart {

   
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int numb, ans;
        System.out.println("Enter Number -->");
        numb=s.nextInt();
        for (int i = 0; i < numb; i++) {
            
        
        ans = (int) (Math.pow(2,i));
        System.out.println("2^" + i + "=" + ans);
    }
        
        
    }
    
}

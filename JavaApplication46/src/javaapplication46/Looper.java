/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication46;

/**
 *
 * @author lupherj
 */
import java.util.Scanner;
public class Looper {
    
    private int sum=0;
    private int x=0;
    public void adder(){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number and I will add it until you enter zero.");
      x=input.nextInt();
      sum=x;
      while(x!=0){
          System.out.println("Enter another number: ");
          x=input.nextInt();
          sum=sum+x;
      }
      System.out.println("The answer is:"+ sum);
      System.out.println("You are now smarter!");
      
        
        
        
    }
    
    
}

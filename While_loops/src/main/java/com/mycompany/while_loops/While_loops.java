/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while_loops;

import java.util.Scanner;

/**
 *
 * @author aadiy
 */
public class While_loops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      /*  int i = 10;
        while(i<100){
            
            System.out.println("i= "+i);
            i= i+3;
        }*/
       
       System.out.println("Enter a number");
      
        int number = scan.nextInt();
        int fact = 1;
        
        
        while(number >0){
            fact *= number;
            number --;
            
        }
        System.out.println("Factorial = " + fact);
      
      
      
    }
}

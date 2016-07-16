/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,sum=0,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
           sum+=i; 
        }
        System.out.println("sum is"+sum);
 
    }
}
